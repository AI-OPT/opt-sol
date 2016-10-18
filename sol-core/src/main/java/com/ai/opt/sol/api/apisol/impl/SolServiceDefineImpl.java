package com.ai.opt.sol.api.apisol.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.opt.sol.api.apisol.ISolServiceDefineSV;
import com.ai.opt.sol.api.apisol.param.APISolServiceDefine;
import com.ai.opt.sol.api.apisol.param.APISolServiceDefineQuery;
import com.ai.opt.sol.business.interfaces.ISolServiceDefineBussiness;
import com.ai.opt.sol.util.SolSeqUtil;

public class SolServiceDefineImpl implements ISolServiceDefineSV{
	private static final Logger LOG = LogManager.getLogger(SolServiceDefineImpl.class);
	@Autowired
	ISolServiceDefineBussiness serviceDefineBussiness;
	@Override
	public BaseResponse createSolService(APISolServiceDefine solServiceDefine) throws BusinessException, SystemException {
		
		BaseResponse response;
		try{
			if(solServiceDefine!=null){
				//定义服务id
				String srvApiId=null;
				//此时用来服务id;
				srvApiId=SolSeqUtil.getServiceId();	
				if(StringUtil.isBlank(srvApiId)){
					throw new BusinessException("000001","serviceId不能为空");
				}
				solServiceDefine.setSrvApiId(srvApiId);
				serviceDefineBussiness.insertServiceDefine(solServiceDefine);
			}
		}catch(BusinessException e){
			 LOG.error("定义服务数据格式失败",e);
	         throw e;
		}catch(Exception e){
			LOG.error("定义服务数据exception异常");
			throw new SystemException("定义服务数据exception异常",e);
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
	public BaseResponse querySolService(APISolServiceDefineQuery solServiceDefineQuery) throws BusinessException, SystemException {
		
		return null;
	}

}
