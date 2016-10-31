package com.ai.opt.sol.api.apisol.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.DateUtil;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.opt.sol.api.apisol.ISolPrdlineVersionSV;
import com.ai.opt.sol.api.apisol.param.APISolPrdline;
import com.ai.opt.sol.api.apisol.param.APISolPrdlineVersion;
import com.ai.opt.sol.api.apisol.param.APISolPrdlineVersionResult;
import com.ai.opt.sol.business.interfaces.ISolPrdlineVersionBussiness;
import com.ai.opt.sol.dao.mapper.bo.SolPrdlineVersion;
import com.ai.opt.sol.dao.mapper.interfaces.SolPrdlineMapper;
import com.ai.opt.sol.util.SolSeqUtil;
import com.alibaba.dubbo.config.annotation.Service;

@Service
@Component
public class SolPrdlineVersionImpl implements ISolPrdlineVersionSV{
	private static final Logger LOG=LogManager.getLogger(SolPrdlineVersionImpl.class);
	@Autowired
	ISolPrdlineVersionBussiness prdlineVersionbuss;
	@Override
	public BaseResponse createSolPrdlineVersion(APISolPrdlineVersion solPrdlineVersion) throws BusinessException, SystemException {
		BaseResponse response;
		try{
			if(solPrdlineVersion!=null){
				String prdlineVersionId=null;
				prdlineVersionId=SolSeqUtil.getPrdlineVersionId();
				if(StringUtil.isBlank(prdlineVersionId)){
					 throw new BusinessException("000001","prdlineVersionId不能为空");
				}
				solPrdlineVersion.setPrdlineVersionId(prdlineVersionId);
				prdlineVersionbuss.insertPrdlineVersion(solPrdlineVersion);
			}
		}catch(BusinessException e){
			 LOG.error("定义产品线版本格式失败",e);
	         throw e;
		}catch(Exception e){
			LOG.error("定义产品线版本exception异常");
			throw new SystemException("定义产品线版本exception异常",e);
		}
		response=new BaseResponse();
		ResponseHeader header = new ResponseHeader();
		header.setIsSuccess(true);
        header.setResultCode("000000");
        header.setResultMessage("产品线版本导入成功");
        response.setResponseHeader(header);
		return response; 
	}

	@Override
	public int modifySolPrdlineVersion(APISolPrdlineVersion solPrdlineVersion) throws BusinessException, SystemException {
		
		return prdlineVersionbuss.modifyPrdVersion(solPrdlineVersion);
	}

	@Override
	public List<APISolPrdlineVersionResult> querySolPrdlineVersion(APISolPrdline apiSolPrdline) throws BusinessException, SystemException {
		List<SolPrdlineVersion> solPrdlineVersions=new ArrayList<SolPrdlineVersion>();
		solPrdlineVersions=prdlineVersionbuss.queryBySolPrdline(apiSolPrdline);
		List<APISolPrdlineVersionResult> prdlineVersionResults=new ArrayList<APISolPrdlineVersionResult>();
		for(SolPrdlineVersion solPrdlineVersion:solPrdlineVersions){
			APISolPrdlineVersionResult prdlineVersionResult=new APISolPrdlineVersionResult();
			prdlineVersionResult.setCreateTime(DateUtil.getDateString(solPrdlineVersion.getCreateTime(), DateUtil.YYYYMMDDHHMMSS));
			prdlineVersionResult.setPrdlineName(apiSolPrdline.getPrdlineName());
			prdlineVersionResult.setPrdlineVersion(solPrdlineVersion.getPrdlineVersion());
			prdlineVersionResults.add(prdlineVersionResult);
		}
		return prdlineVersionResults;
	}

	@Override
	public List<APISolPrdlineVersion> querySolPrdlineVersionId(String prdlineId) throws BusinessException, SystemException {
		List<APISolPrdlineVersion> apiSolPrdlineVersions=new ArrayList<APISolPrdlineVersion>();
		if(StringUtil.isBlank(prdlineId)){
			throw new BusinessException("000001","prdlineId不能为空");
		}else{
			List<SolPrdlineVersion> solPrdVersions=new ArrayList<SolPrdlineVersion>();
			solPrdVersions=prdlineVersionbuss.queryByPrdId(prdlineId);
			for(SolPrdlineVersion solPrdVersion:solPrdVersions){
				APISolPrdlineVersion apiSolPrdVersion=new APISolPrdlineVersion();
				apiSolPrdVersion.setCreateTime(DateUtil.getDateString(solPrdVersion.getCreateTime(), DateUtil.YYYYMMDDHHMMSS));
				apiSolPrdVersion.setPrdlineId(solPrdVersion.getPrdlineId());
				apiSolPrdVersion.setPrdlineVersion(solPrdVersion.getPrdlineVersion());
				apiSolPrdVersion.setPrdlineVersionId(solPrdVersion.getPrdlineVersionId());
				apiSolPrdVersion.setVersionRemark(solPrdVersion.getVersionRemark());
				apiSolPrdlineVersions.add(apiSolPrdVersion);
			}
		}
		return apiSolPrdlineVersions;
	}

}
