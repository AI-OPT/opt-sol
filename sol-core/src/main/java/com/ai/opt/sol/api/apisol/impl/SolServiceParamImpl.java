package com.ai.opt.sol.api.apisol.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.opt.sol.api.apisol.ISolServiceParamSV;
import com.ai.opt.sol.api.apisol.param.APISolServiceDesignInput;
import com.ai.opt.sol.api.apisol.param.APISolServiceDesignOutput;
import com.ai.opt.sol.api.apisol.param.APISolServiceQueryResult;
import com.ai.opt.sol.business.interfaces.ISolServiceDesignInputBuessiness;
import com.ai.opt.sol.business.interfaces.ISolServiceDesignOutputBussiness;
import com.ai.opt.sol.util.SolSeqUtil;

public class SolServiceParamImpl implements ISolServiceParamSV{
	private static final Logger LOG = LogManager.getLogger(SolServiceParamImpl.class);
	@Autowired
	ISolServiceDesignInputBuessiness serviceInputBussiness;
	@Autowired
	ISolServiceDesignOutputBussiness serviceOutputBussiness;
	@Override
	public BaseResponse createServiceInput(APISolServiceDesignInput solServiceDesignInput) throws BusinessException, SystemException {
		
		BaseResponse response;
		try{
			if(solServiceDesignInput!=null){
				//定义服务入参id
				String inputId=null;
				//此时用来服务id;
				inputId=SolSeqUtil.getServiceInputId();		
				if(StringUtil.isBlank(inputId)){
					throw new BusinessException("000001","inputId不能为空");
				}
				if(StringUtil.isBlank((solServiceDesignInput.getSrvApiId()))){
					throw new BusinessException("000001","srvApiId不能为空");
				}
				solServiceDesignInput.setInputId(inputId);
				serviceInputBussiness.insertServiceInput(solServiceDesignInput);
			}
		}catch(BusinessException e){
			 LOG.error("定义服务入参数据格式失败",e);
	         throw e;
		}catch(Exception e){
			LOG.error("定义服务入参数据exception异常");
			throw new SystemException("定义服务入参数据exception异常",e);
		}
		response=new BaseResponse();
		ResponseHeader header = new ResponseHeader();
		header.setIsSuccess(true);
        header.setResultCode("000000");
        header.setResultMessage("服务入参导入成功");
        response.setResponseHeader(header);
		return response;
	}

	@Override
	public BaseResponse createServiceOutput(APISolServiceDesignOutput solServiceDesignOutput) throws BusinessException, SystemException {
		
		BaseResponse response;
		try{
			if(solServiceDesignOutput!=null){
				//定义服务入参id
				String outputId=null;
				//此时用来服务id;
				outputId=SolSeqUtil.getServiceOutputId();				
				if(StringUtil.isBlank(outputId)){
					throw new BusinessException("000001","outputId不能为空");
				}
				if(StringUtil.isBlank((solServiceDesignOutput.getSrvApiId()))){
					throw new BusinessException("000001","srvApiId不能为空");
				}
				solServiceDesignOutput.setOutputId(outputId);
				serviceOutputBussiness.insertServiceOutput(solServiceDesignOutput);
			}
		}catch(BusinessException e){
			 LOG.error("定义服务出参数据格式失败",e);
	         throw e;
		}catch(Exception e){
			LOG.error("定义服务出参数据exception异常");
			throw new SystemException("定义服务出参数据exception异常",e);
		}
		response=new BaseResponse();
		ResponseHeader header = new ResponseHeader();
		header.setIsSuccess(true);
        header.setResultCode("000000");
        header.setResultMessage("服务出参导入成功");
        response.setResponseHeader(header);
		return response;
	}

	@Override
	public APISolServiceQueryResult designServiceQuery(String srvApiId) throws BusinessException, SystemException {
		
		return null;
	}

	@Override
	public List<APISolServiceDesignInput> modifyInputServiceParam(APISolServiceDesignInput srvApiId) throws BusinessException, SystemException {
		
		return null;
	}

	@Override
	public List<APISolServiceDesignOutput> modifyOutputServiceParam(APISolServiceDesignOutput srvApiId) throws BusinessException, SystemException {
		
		return null;
	}

	@Override
	public int delInputServiceParam(APISolServiceDesignInput srvInput) throws BusinessException, SystemException {
		
		return 0;
	}

	@Override
	public void delOutputServiceParam(APISolServiceDesignOutput srvOutput) throws BusinessException, SystemException {
	}

}
