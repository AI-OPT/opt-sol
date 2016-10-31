package com.ai.opt.sol.api.apisol.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;

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
import com.ai.opt.sol.api.apisol.param.APISrvQueryCount;
import com.ai.opt.sol.business.interfaces.ISolServiceDefineBussiness;
import com.ai.opt.sol.business.interfaces.ISolServicePrdlineRelBussiness;
import com.ai.opt.sol.business.interfaces.ISolServiceVersionBussiness;
import com.ai.opt.sol.dao.mapper.bo.SolServiceDefine;
import com.ai.opt.sol.dao.mapper.bo.SolServicePrdlineRel;
import com.ai.opt.sol.util.SolSeqUtil;

public class SolServiceDefineImpl implements ISolServiceDefineSV{
	private static final Logger LOG = LogManager.getLogger(SolServiceDefineImpl.class);
	@Autowired
	ISolServiceDefineBussiness serviceDefineBussiness;
	@Autowired
	ISolServiceVersionBussiness srvVersionBussiness;
	@Autowired
	ISolServicePrdlineRelBussiness solSrvPrdlineBussiness;
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
	public  List<APISrvQueryCount> querySolService(APISolServiceDefine solServiceDefineQuery) throws BusinessException, SystemException {
		List<SolServiceDefine> solSrvDefines=new ArrayList<SolServiceDefine>();
		List<APISrvQueryCount> srvQueryCounts=new ArrayList<APISrvQueryCount>();
		solSrvDefines=serviceDefineBussiness.queryServiceByParams(solServiceDefineQuery);
		for(SolServiceDefine solSrvDefine:solSrvDefines){
			List<SolServicePrdlineRel> srvPrdlineRels=new ArrayList<SolServicePrdlineRel>();
			APISrvQueryCount srvQueryCount=new APISrvQueryCount();
			String srvId=solSrvDefine.getSrvApiId();
			srvQueryCount.setSrvVersionCount(String.valueOf(srvVersionBussiness.countBySrvId(srvId)));
			srvPrdlineRels=solSrvPrdlineBussiness.queryPrdlineSrv(solSrvDefine.getSrvApiId());
			srvQueryCount.setPrdFlagCount(String.valueOf(srvPrdlineRels.size()));
			srvQueryCount.setSrvApiId(srvId);
			srvQueryCount.setSrvApiName(solSrvDefine.getSrvApiName());
			List<String> catagory=new ArrayList<String>();
			catagory.add(solSrvDefine.getSrvCenter());
			catagory.add(solSrvDefine.getSrvCategoryId());
			srvQueryCount.setSrvCategory(catagory);
			srvQueryCounts.add(srvQueryCount);
		}
		return srvQueryCounts;
	}

	@Override
	public int modifySolService(APISolServiceDefine solServiceDefineQuery) throws BusinessException, SystemException {
		
		return serviceDefineBussiness.modifySrvDefine(solServiceDefineQuery);
	}

}
