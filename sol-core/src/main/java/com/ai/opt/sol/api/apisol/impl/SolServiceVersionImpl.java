package com.ai.opt.sol.api.apisol.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.sdk.util.DateUtil;
import com.ai.opt.sol.api.apisol.ISolServiceVersionSV;
import com.ai.opt.sol.api.apisol.param.APISolServiceDefine;
import com.ai.opt.sol.api.apisol.param.APISolServiceVersion;
import com.ai.opt.sol.business.interfaces.ISolServiceDefineBussiness;
import com.ai.opt.sol.business.interfaces.ISolServiceVersionBussiness;
import com.ai.opt.sol.dao.mapper.bo.SolServiceDefine;
import com.ai.opt.sol.dao.mapper.bo.SolServiceVersion;
import com.alibaba.dubbo.config.annotation.Service;
@Service
@Component
public class SolServiceVersionImpl implements ISolServiceVersionSV{
	@Autowired
	ISolServiceDefineBussiness srvDefineBussiness;
	@Autowired
	ISolServiceVersionBussiness srvVersionBussiness;
	@Override
	public BaseResponse createSolServiceVersion(APISolServiceVersion solSrvVersion) throws BusinessException, SystemException {
		
		return null;
	}

	@Override
	public List<APISolServiceVersion> querySolServiceVersion(APISolServiceDefine srvDefine) throws BusinessException, SystemException {
		List<SolServiceDefine> solSrvDefines=new ArrayList<SolServiceDefine>();
		List<APISolServiceVersion> apiSolSrvVersions=new ArrayList<APISolServiceVersion>();
		solSrvDefines=srvDefineBussiness.queryServiceByParams(srvDefine);
		List<SolServiceVersion> srvVersions=new ArrayList<SolServiceVersion>();
		for(SolServiceDefine solSrvDefine:solSrvDefines){
			List<SolServiceVersion> srvVersion=new ArrayList<SolServiceVersion>();
			srvVersion=srvVersionBussiness.queryByApiId(solSrvDefine.getSrvApiId());
			srvVersions.addAll(srvVersion);
		}
		for(SolServiceVersion solSrvVersion:srvVersions){
			APISolServiceVersion apiSolSrvVersion=new APISolServiceVersion();
			apiSolSrvVersion.setCreateTime(DateUtil.getDateString(solSrvVersion.getCreateTime(), DateUtil.YYYYMMDDHHMMSS));
			apiSolSrvVersion.setSrvApiId(solSrvVersion.getSrvApiId());
			apiSolSrvVersion.setSrvVersion(solSrvVersion.getSrvVersion());
			apiSolSrvVersion.setSrvVersionId(solSrvVersion.getSrvVersionId());
			apiSolSrvVersion.setVersionRemark(solSrvVersion.getVersionRemark());
			apiSolSrvVersions.add(apiSolSrvVersion);
		}
		return apiSolSrvVersions;
	}

	@Override
	public List<APISolServiceVersion> querySolServiceVersionId(String srvApiId) throws BusinessException, SystemException {
		
		return null;
	}

}
