package com.ai.opt.sol.api.apisol.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.opt.sol.api.apisol.ISolPrdlineSV;
import com.ai.opt.sol.api.apisol.param.APISolPrdline;
import com.ai.opt.sol.api.apisol.param.APISolPrdlineQuery;
import com.ai.opt.sol.business.interfaces.IPrdlineBussiness;
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
				//prdlineId="1";
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
	public APISolPrdline querySolPrdlineNameCode(APISolPrdlineQuery solPrdlineQuery) throws BusinessException, SystemException {
		
		return null;
	}

	@Override
	public APISolPrdline querySolPrdlineId(String PrdlineId) throws BusinessException, SystemException {
		
		return null;
	}

}
