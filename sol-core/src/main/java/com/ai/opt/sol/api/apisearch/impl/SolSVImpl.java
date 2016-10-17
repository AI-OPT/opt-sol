package com.ai.opt.sol.api.apisearch.impl;

import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.opt.sol.api.apisearch.ISolSV;
import com.ai.opt.sol.api.apisearch.param.APISolPrdline;
import com.ai.opt.sol.api.apisearch.param.APISolServiceDefine;
import com.ai.opt.sol.api.apisearch.param.APISolServiceDesignInput;
import com.ai.opt.sol.api.apisearch.param.APISolServiceDesignOutput;
import com.ai.opt.sol.business.interfaces.IPrdlineBussiness;
import com.ai.opt.sol.dao.interfaces.SolPrdlineMapper;
import com.ai.opt.sol.dao.interfaces.SolServiceDefineMapper;
import com.ai.opt.sol.dao.interfaces.SolServiceDesignInputMapper;
import com.ai.opt.sol.dao.interfaces.SolServiceDesignOutputMapper;
import com.ai.opt.sol.dao.mapper.bo.SolPrdline;
import com.ai.opt.sol.dao.mapper.bo.SolServiceDefine;
import com.ai.opt.sol.dao.mapper.bo.SolServiceDesignInput;
import com.ai.opt.sol.dao.mapper.bo.SolServiceDesignOutput;
import com.ai.opt.sol.util.SolSeqUtil;
import com.alibaba.dubbo.config.annotation.Service;

@Service
@Component
public class SolSVImpl implements ISolSV{
	private static final Logger LOG = LogManager.getLogger(ISolSV.class);
	@Autowired
	IPrdlineBussiness prdlineBussiness;
	@Autowired
	SolServiceDefineMapper solServiceDefineMapper;
	@Autowired
	SolServiceDesignInputMapper solServiceDesignInputMapper;
	@Autowired
	SolServiceDesignOutputMapper solServiceDesignOutputMapper;
	@Override
	public BaseResponse createSolPrdline(APISolPrdline solPrdline) throws BusinessException, SystemException {
		BaseResponse response;
		try{
			if(solPrdline!=null){
				//定义产品线id
				String prdlineId=null;
				//此时用来获取产品线id；
				//prdlineId=SolSeqUtil.getPrdlineId();
				prdlineId="1";
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
	public BaseResponse createSolService(APISolServiceDefine solServiceDefine) throws BusinessException, SystemException {
		BaseResponse response;
		SolServiceDefine solServiceDefineBo;
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
				solServiceDefineBo=new SolServiceDefine();
				BeanUtils.copyProperties(solServiceDefineBo,solServiceDefine);
				solServiceDefineMapper.insert(solServiceDefineBo);
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
	public BaseResponse designServiceInput(APISolServiceDesignInput solServiceDesignInput) throws BusinessException, SystemException {
		BaseResponse response;
		SolServiceDesignInput solServiceDesignInputBo;
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
				solServiceDesignInputBo=new SolServiceDesignInput();
				BeanUtils.copyProperties(solServiceDesignInputBo,solServiceDesignInput);
				solServiceDesignInputMapper.insert(solServiceDesignInputBo);
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
	public BaseResponse designServiceOutput(APISolServiceDesignOutput solServiceDesignOutput) throws BusinessException, SystemException {
		
		BaseResponse response;
		SolServiceDesignOutput solServiceDesignOutputBo;
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
				solServiceDesignOutputBo=new SolServiceDesignOutput();
				BeanUtils.copyProperties(solServiceDesignOutputBo,solServiceDesignOutput);
				solServiceDesignOutputMapper.insert(solServiceDesignOutputBo);
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

}
