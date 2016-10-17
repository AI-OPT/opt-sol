package com.ai.opt.sol.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.sdk.util.DateUtil;
import com.ai.opt.sol.api.apisearch.param.APISolPrdline;
import com.ai.opt.sol.business.interfaces.IPrdlineBussiness;
import com.ai.opt.sol.dao.interfaces.SolPrdlineMapper;
import com.ai.opt.sol.dao.mapper.bo.SolPrdline;

@Service
@Transactional()
public class IPrdlineBussinessImpl implements IPrdlineBussiness{
	@Autowired
	SolPrdlineMapper solPrdlineMapper;
	@Override
	public void insertPrdline(APISolPrdline prdline) {
		SolPrdline solPrdline=new SolPrdline();
		solPrdline.setCreateTime(DateUtil.getTimestamp(prdline.getCreateTime(), DateUtil.YYYYMMDDHHMMSS));
		solPrdline.setIndustryCode(prdline.getIndustryCode());
		solPrdline.setPrdlineId(prdline.getPrdlineId());
		solPrdline.setPrdlineManager(prdline.getPrdlineManager());
		solPrdline.setPrdlineName(prdline.getPrdlineName());
		solPrdline.setPrdlineRemark(prdline.getPrdlineRemark());
		solPrdline.setUpdateTime(DateUtil.getTimestamp(prdline.getUpdateTime(), DateUtil.YYYYMMDDHHMMSS));
		solPrdlineMapper.insert(solPrdline);
	}

}
