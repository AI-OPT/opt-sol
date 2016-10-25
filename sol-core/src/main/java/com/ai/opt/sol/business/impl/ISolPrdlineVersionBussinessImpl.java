package com.ai.opt.sol.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.sdk.util.DateUtil;
import com.ai.opt.sol.api.apisol.param.APISolPrdlineVersion;
import com.ai.opt.sol.business.interfaces.ISolPrdlineVersionBussiness;
import com.ai.opt.sol.dao.mapper.bo.SolPrdlineVersion;
import com.ai.opt.sol.dao.mapper.interfaces.SolPrdlineVersionMapper;

@Service
@Transactional()
public class ISolPrdlineVersionBussinessImpl implements ISolPrdlineVersionBussiness{
	@Autowired
	SolPrdlineVersionMapper solPrdlineVersionMapper;
	@Override
	public void insertPrdlineVersion(APISolPrdlineVersion prdlineVersion) {
		SolPrdlineVersion solPrdlineVersion=new SolPrdlineVersion();
		solPrdlineVersion.setCreateTime(DateUtil.getTimestamp(prdlineVersion.getCreateTime(), DateUtil.YYYYMMDDHHMMSS));
		solPrdlineVersion.setPrdlineId(prdlineVersion.getPrdlineId());
		solPrdlineVersion.setPrdlineVersion(prdlineVersion.getPrdlineVersion());
		solPrdlineVersion.setPrdlineVersionId(prdlineVersion.getPrdlineVersionId());
		solPrdlineVersion.setVersionRemark(prdlineVersion.getVersionRemark());
		solPrdlineVersionMapper.insert(solPrdlineVersion);
	}

}
