package com.ai.opt.sol.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.sdk.util.DateUtil;
import com.ai.opt.sol.api.apisol.param.APISolServiceDefine;
import com.ai.opt.sol.business.interfaces.ISolServiceDefineBussiness;
import com.ai.opt.sol.dao.mapper.bo.SolServiceDefine;
import com.ai.opt.sol.dao.mapper.interfaces.SolServiceDefineMapper;

@Service
@Transactional()
public class ISolServiceDefineBussinessImpl implements ISolServiceDefineBussiness{
	@Autowired
	SolServiceDefineMapper solServiceDefineMapper;
	@Override
	public void insertServiceDefine(APISolServiceDefine solServiceDefine) {
		SolServiceDefine serviceDefine=new SolServiceDefine();
		serviceDefine.setCreateTime(DateUtil.getTimestamp(solServiceDefine.getCreateTime(), DateUtil.YYYYMMDDHHMMSS));
		serviceDefine.setSrvApiId(solServiceDefine.getSrvApiId());
		serviceDefine.setSrvApiName(solServiceDefine.getSrvApiName());
		serviceDefine.setSrvCategoryId(solServiceDefine.getSrvCategoryId());
		serviceDefine.setSrvCenter(solServiceDefine.getSrvCenter());
		serviceDefine.setSrvClass(solServiceDefine.getSrvClass());
		serviceDefine.setSrvRemark(solServiceDefine.getSrvRemark());
		serviceDefine.setUpdateTime(DateUtil.getTimestamp(solServiceDefine.getUpdateTime(), DateUtil.YYYYMMDDHHMMSS));
		solServiceDefineMapper.insert(serviceDefine);
	}

}
