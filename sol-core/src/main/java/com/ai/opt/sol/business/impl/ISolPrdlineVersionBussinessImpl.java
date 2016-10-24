package com.ai.opt.sol.business.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.sol.api.apisol.param.APISolPrdlineVersion;
import com.ai.opt.sol.business.interfaces.ISolPrdlineVersionBussiness;

@Service
@Transactional()
public class ISolPrdlineVersionBussinessImpl implements ISolPrdlineVersionBussiness{

	@Override
	public void insertPrdlineVersion(APISolPrdlineVersion prdlineVersion) {
		
	}

}
