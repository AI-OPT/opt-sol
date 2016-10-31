package com.ai.opt.sol.api.apisol.impl;

import java.util.ArrayList;
import java.util.Iterator;
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
import com.ai.opt.sol.api.apisol.param.APIPrdFlag;
import com.ai.opt.sol.api.apisol.param.APISolServiceDefine;
import com.ai.opt.sol.api.apisol.param.APISolServicePrdlineRel;
import com.ai.opt.sol.api.apisol.param.APISolSrvPrdline;
import com.ai.opt.sol.business.interfaces.IPrdlineBussiness;
import com.ai.opt.sol.business.interfaces.ISolPrdlineVersionBussiness;
import com.ai.opt.sol.business.interfaces.ISolServicePrdlineRelBussiness;
import com.ai.opt.sol.business.interfaces.ISolServiceVersionBussiness;
import com.ai.opt.sol.dao.mapper.bo.SolPrdline;
import com.ai.opt.sol.dao.mapper.bo.SolPrdlineVersion;
import com.ai.opt.sol.dao.mapper.bo.SolServiceDefine;
import com.ai.opt.sol.dao.mapper.bo.SolServicePrdlineRel;
import com.ai.opt.sol.dao.mapper.bo.SolServiceVersion;
import com.ai.opt.sol.util.SolSeqUtil;
import com.alibaba.dubbo.config.annotation.Service;
@Service
@Component
public class SolServicePrdlineRelImpl implements ISolServicePrdlineRelSV{
	private static final Logger LOG=LogManager.getLogger(SolServicePrdlineRelImpl.class);
	@Autowired
	ISolServicePrdlineRelBussiness srvPrdlineRelBussiness;
	@Autowired
	IPrdlineBussiness prdlineBussiness;
	@Autowired
	ISolServiceVersionBussiness srvVersionBussiness;
	@Autowired
	ISolPrdlineVersionBussiness prdVersionBussiness;
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
	public List<APISolServiceDefine> manageSolServicePrdlineRel(APISolSrvPrdline srvPrdline) throws BusinessException, SystemException {
			List<APISolServiceDefine> apiSolSrvDefines=new ArrayList<APISolServiceDefine>();
			List<SolServiceDefine> solSrvDefines=new ArrayList<SolServiceDefine>();
			solSrvDefines=srvPrdlineRelBussiness.querySrvPrdRel(srvPrdline.getPrdlineId());
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
			if(StringUtil.isBlank(srvPrdline.getSrvApiId())&&StringUtil.isBlank(srvPrdline.getSrvApiName())&&StringUtil.isBlank(srvPrdline.getSrvCategoryId())&&StringUtil.isBlank(srvPrdline.getSrvCenter())){

				return apiSolSrvDefines;
			}else{
				Iterator<APISolServiceDefine> iter=apiSolSrvDefines.iterator();
				if(!StringUtil.isBlank(srvPrdline.getSrvApiId())){
					while(iter.hasNext()){
						if(!(srvPrdline.getSrvApiId()).equals(iter.next().getSrvApiId()))
							iter.remove();
					}
					return apiSolSrvDefines;
				}
				if(!StringUtil.isBlank(srvPrdline.getSrvApiName())){
					while(iter.hasNext()){
						if(!(srvPrdline.getSrvApiName()).equals(iter.next().getSrvApiName()))
							iter.remove();
					}
					return apiSolSrvDefines;
				}
				if(!StringUtil.isBlank(srvPrdline.getSrvCategoryId())){
					while(iter.hasNext()){
						if(!(srvPrdline.getSrvCategoryId()).equals(iter.next().getSrvCategoryId()))
							iter.remove();
					}
					return apiSolSrvDefines;
				}
				if(!StringUtil.isBlank(srvPrdline.getSrvCenter())){
					while(iter.hasNext()){
						if(!(srvPrdline.getSrvCenter()).equals(iter.next().getSrvCenter()))
							iter.remove();
					}
					return apiSolSrvDefines;
				}
				return apiSolSrvDefines;
			}

	}

	@Override
	public List<APISolServicePrdlineRel> modifySolServicePrdlineRel(APISolServicePrdlineRel srvPrdlineRel) throws BusinessException, SystemException {
		
		return null;
	}

	@Override
	public List<APIPrdFlag> querySolServicePrdlineRel(String srvApiId) throws BusinessException, SystemException {
		 List<APIPrdFlag> apiPrdFlags=new ArrayList<APIPrdFlag>();
		if(!StringUtil.isBlank(srvApiId)){
			List<SolServicePrdlineRel> solSrvPrdlineRels=new ArrayList<SolServicePrdlineRel>();
			solSrvPrdlineRels=srvPrdlineRelBussiness.queryPrdlineSrv(srvApiId);
			for(SolServicePrdlineRel solSrvPrdlineRel:solSrvPrdlineRels){
				APIPrdFlag apiPrdFlag=new APIPrdFlag();
				String prdlineId=solSrvPrdlineRel.getSrvPrdlineId();
				List<SolPrdline> solPrdlines=new ArrayList<SolPrdline>();
				List<SolPrdlineVersion> prdlineVersions=new ArrayList<SolPrdlineVersion>();
				List<SolServiceVersion> srvVersions=new ArrayList<SolServiceVersion>();
				solPrdlines=prdlineBussiness.queryPrdlineId(prdlineId);
				apiPrdFlag.setPrdlineCode(prdlineId);
				apiPrdFlag.setPrdlineVersionId(solSrvPrdlineRel.getPrdVersion());
				apiPrdFlag.setSrvPrdlineId(solSrvPrdlineRel.getSrvPrdlineId());
				apiPrdFlag.setSrvVersionId(solSrvPrdlineRel.getSrvVersionId());
				for(SolPrdline solPrdline:solPrdlines){
					apiPrdFlag.setPrdlineManager(solPrdline.getPrdlineManager());
					apiPrdFlag.setPrdlineName(solPrdline.getPrdlineName());	
				}
				srvVersions=srvVersionBussiness.queryBySrvVertion(solSrvPrdlineRel.getSrvVersionId());
				for(SolServiceVersion srvVersion:srvVersions){
					apiPrdFlag.setServiceVersion(srvVersion.getSrvVersion());
				}
				prdlineVersions=prdVersionBussiness.queryByPrdversionId(solSrvPrdlineRel.getPrdVersion());
				for(SolPrdlineVersion prdlineVersion:prdlineVersions){
					apiPrdFlag.setPrdlineVersion(prdlineVersion.getPrdlineVersion());
				}
				apiPrdFlags.add(apiPrdFlag);
			}
		}
		return apiPrdFlags;
	}

}
