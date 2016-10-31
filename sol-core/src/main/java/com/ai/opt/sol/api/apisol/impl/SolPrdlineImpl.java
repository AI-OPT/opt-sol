package com.ai.opt.sol.api.apisol.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.DateUtil;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.opt.sol.api.apisol.ISolPrdlineSV;
import com.ai.opt.sol.api.apisol.param.APISolPrdline;
import com.ai.opt.sol.api.apisol.param.APISolPrdlineQuery;
import com.ai.opt.sol.api.apisol.param.APISolSrvPrdline;
import com.ai.opt.sol.business.interfaces.IPrdlineBussiness;
import com.ai.opt.sol.dao.mapper.bo.SolPrdline;
import com.ai.opt.sol.dao.mapper.bo.SolPrdlineCriteria;
import com.ai.opt.sol.util.SolSeqUtil;
import com.alibaba.dubbo.config.annotation.Service;

@Service
@Component
public class SolPrdlineImpl implements ISolPrdlineSV{
	private static final Logger LOG = LogManager.getLogger(SolPrdlineImpl.class);
	@Autowired
	IPrdlineBussiness prdlineBussiness;
	@Override
	public BaseResponse createSolPrdline(APISolPrdline solPrdline) throws BusinessException, SystemException {
		BaseResponse response;
		try{
			if(solPrdline!=null){
				//定义产品线id
				String prdlineId=null;
				//此时用来获取产品线id；
				prdlineId=SolSeqUtil.getPrdlineId();
				if(StringUtil.isBlank(prdlineId)){
					 throw new BusinessException("000001","prdlineId不能为空");
				}
				solPrdline.setPrdlineId(prdlineId);
				prdlineBussiness.insertPrdline(solPrdline);
			}
		}catch(BusinessException e){
			 LOG.error("定义产品线数据格式失败",e);
	         throw e;
		}catch(Exception e){
			LOG.error("定义产品线数据exception异常");
			throw new SystemException("定义产品线数据exception异常",e);
		}
		response=new BaseResponse();
		ResponseHeader header = new ResponseHeader();
		header.setIsSuccess(true);
        header.setResultCode("000000");
        header.setResultMessage("产品线数据导入成功");
        response.setResponseHeader(header);
		return response; 
	}


	@Override
	public List<APISolPrdline> querySolPrdlineNameCode(APISolPrdlineQuery solPrdlineQuery) throws BusinessException, SystemException {
		List<SolPrdline> solPrdlines=prdlineBussiness.queryPrdlineName(solPrdlineQuery);
		List<APISolPrdline> apiSolPrdlines=new ArrayList<APISolPrdline>();
		for(SolPrdline solPrdline:solPrdlines){
			APISolPrdline apiSolPrdline=new APISolPrdline();
			apiSolPrdline.setCreateTime(DateUtil.getDateString(solPrdline.getCreateTime(), DateUtil.YYYYMMDDHHMMSS));
			apiSolPrdline.setIndustryCode(solPrdline.getIndustryCode());
			apiSolPrdline.setPrdlineCode(solPrdline.getPrdlineCode());
			apiSolPrdline.setPrdlineId(solPrdline.getPrdlineId());
			apiSolPrdline.setPrdlineManager(solPrdline.getPrdlineManager());
			apiSolPrdline.setPrdlineName(solPrdline.getPrdlineName());
			apiSolPrdline.setPrdlineRemark(solPrdline.getPrdlineRemark());
			apiSolPrdline.setUpdateTime(DateUtil.getDateString(solPrdline.getUpdateTime(), DateUtil.YYYYMMDDHHMMSS));
			apiSolPrdlines.add(apiSolPrdline);
		}
		return apiSolPrdlines;
	}

	@Override
	public List<APISolPrdline> querySolPrdlineId(String prdlineId) throws BusinessException, SystemException {
		List<APISolPrdline> apiSolPrdlines=new ArrayList<APISolPrdline>();
		try{
			List<SolPrdline> solPrdlines=prdlineBussiness.queryPrdlineId(prdlineId);
			for(SolPrdline solPrdline:solPrdlines){
				APISolPrdline apiSolPrdline=new APISolPrdline();
				apiSolPrdline.setCreateTime(DateUtil.getDateString(solPrdline.getCreateTime(), DateUtil.YYYYMMDDHHMMSS));
				apiSolPrdline.setIndustryCode(solPrdline.getIndustryCode());
				apiSolPrdline.setPrdlineCode(solPrdline.getPrdlineCode());
				apiSolPrdline.setPrdlineId(solPrdline.getPrdlineId());
				apiSolPrdline.setPrdlineManager(solPrdline.getPrdlineManager());
				apiSolPrdline.setPrdlineName(solPrdline.getPrdlineName());
				apiSolPrdline.setPrdlineRemark(solPrdline.getPrdlineRemark());
				apiSolPrdline.setUpdateTime(DateUtil.getDateString(solPrdline.getUpdateTime(), DateUtil.YYYYMMDDHHMMSS));
				apiSolPrdlines.add(apiSolPrdline);
			}
		}catch(BusinessException e){
			 LOG.error("查询产品线数据格式失败",e);
	         throw e;
		}
			return apiSolPrdlines;
	}


	@Override
	public int modifySolPrdline(APISolPrdline solPrdline) throws BusinessException, SystemException {
		return prdlineBussiness.modifyPrdlineSV(solPrdline);
	}


	@Override
	public int delSolPrdline(APISolPrdline Prdline) throws BusinessException, SystemException {
		
		return prdlineBussiness.delPrdlineId(Prdline);
	}

}
