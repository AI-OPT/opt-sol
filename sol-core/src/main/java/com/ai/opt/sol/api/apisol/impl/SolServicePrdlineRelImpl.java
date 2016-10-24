package com.ai.opt.sol.api.apisol.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.DateUtil;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.opt.sol.api.apisol.ISolServicePrdlineRelSV;
import com.ai.opt.sol.api.apisol.param.APISolServiceDefine;
import com.ai.opt.sol.api.apisol.param.APISolServicePrdlineRel;
import com.ai.opt.sol.business.interfaces.ISolServicePrdlineRelBussiness;
import com.ai.opt.sol.dao.mapper.bo.SolServiceDefine;
import com.ai.opt.sol.util.SolSeqUtil;
import com.alibaba.dubbo.config.annotation.Service;
@Service
@Component
public class SolServicePrdlineRelImpl implements ISolServicePrdlineRelSV{
	private static final Logger LOG=LogManager.getLogger(SolServicePrdlineRelImpl.class);
	@Autowired
	ISolServicePrdlineRelBussiness srvPrdlineRelBussiness;
	@Override
	public BaseResponse createSolServicePrdlineRel(APISolServicePrdlineRel srvPrdlineRel) throws BusinessException, SystemException {
		BaseResponse response;
		try{
			if(srvPrdlineRel!=null){
				String srvPrdlineId=null;
				srvPrdlineId=SolSeqUtil.getSrvPrdlineId();
				if(StringUtil.isBlank(srvPrdlineId)){
					throw new BusinessException("000001","srvprdlineId不能为空");
				}
				srvPrdlineRel.setSrvPrdlineId(srvPrdlineId);
				srvPrdlineRelBussiness.insertSrvPrdRel(srvPrdlineRel);
			}
		}catch(BusinessException e){
			 LOG.error("定义服务产品标签数据格式失败",e);
	         throw e;
		}catch(Exception e){
			LOG.error("定义服务产品标签数据exception异常");
			throw new SystemException("定义服务产品标签数据exception异常",e);
		}
		response=new BaseResponse();
		ResponseHeader header = new ResponseHeader();
		header.setIsSuccess(true);
        header.setResultCode("000000");
        header.setResultMessage("服务产品标签导入成功");
        response.setResponseHeader(header);
		return response; 
	}

	@Override
	public List<APISolServiceDefine> manageSolServicePrdlineRel(String prdlineId) throws BusinessException, SystemException {
		if(StringUtil.isBlank(prdlineId)){
			throw new BusinessException("000001","prdlineId不能为空");
		}else{
			List<APISolServiceDefine> apiSolSrvDefines=new ArrayList<APISolServiceDefine>();
			List<SolServiceDefine> solSrvDefines=new ArrayList<SolServiceDefine>();
			solSrvDefines=srvPrdlineRelBussiness.querySrvPrdRel(prdlineId);
			for(SolServiceDefine solSrvDefine:solSrvDefines){
				APISolServiceDefine apiSolSrvDefine=new APISolServiceDefine();
				apiSolSrvDefine.setCreateTime(DateUtil.getDateString(solSrvDefine.getCreateTime(), DateUtil.YYYYMMDDHHMMSS));
				apiSolSrvDefine.setSrvApiId(solSrvDefine.getSrvApiId());
				apiSolSrvDefine.setSrvApiName(solSrvDefine.getSrvApiName());
				apiSolSrvDefine.setSrvCategoryId(solSrvDefine.getSrvCategoryId());
				apiSolSrvDefine.setSrvCenter(solSrvDefine.getSrvCenter());
				apiSolSrvDefine.setSrvClass(solSrvDefine.getSrvClass());
				apiSolSrvDefine.setSrvRemark(solSrvDefine.getSrvRemark());
				apiSolSrvDefine.setUpdateTime(DateUtil.getDateString(solSrvDefine.getUpdateTime(), DateUtil.YYYYMMDDHHMMSS));
				apiSolSrvDefines.add(apiSolSrvDefine);
			}
			return apiSolSrvDefines;
		}
	}

}
