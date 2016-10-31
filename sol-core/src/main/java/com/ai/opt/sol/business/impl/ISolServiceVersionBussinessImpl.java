package com.ai.opt.sol.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.sol.api.apisol.param.APISolServiceVersion;
import com.ai.opt.sol.business.interfaces.ISolServiceVersionBussiness;
import com.ai.opt.sol.dao.mapper.bo.SolServiceVersion;
import com.ai.opt.sol.dao.mapper.bo.SolServiceVersionCriteria;
import com.ai.opt.sol.dao.mapper.interfaces.SolServiceVersionMapper;
@Service
@Transactional()
public class ISolServiceVersionBussinessImpl implements ISolServiceVersionBussiness{
	@Autowired
	SolServiceVersionMapper srvVersionMapper;
	@Override
	public int countBySrvId(String srvApiId) {
		SolServiceVersionCriteria sql=new SolServiceVersionCriteria();
		SolServiceVersionCriteria.Criteria criteria=sql.createCriteria();
		criteria.andSrvApiIdEqualTo(srvApiId);
		return srvVersionMapper.countByExample(sql);
	}

	@Override
	public void insertSrvVersion(APISolServiceVersion srvVersion) {
	}

	@Override
	public List<SolServiceVersion> queryByApiId(String srvApiId) {
		SolServiceVersionCriteria sql=new SolServiceVersionCriteria();
		SolServiceVersionCriteria.Criteria criteria=sql.createCriteria();
		criteria.andSrvApiIdEqualTo(srvApiId);
		return srvVersionMapper.selectByExample(sql);
	}

	@Override
	public List<SolServiceVersion> queryBySrvVertion(String serviceVertionId) {
		
		SolServiceVersionCriteria sql=new SolServiceVersionCriteria();
		SolServiceVersionCriteria.Criteria criteria=sql.createCriteria();
		criteria.andSrvVersionIdEqualTo(serviceVertionId);
		return srvVersionMapper.selectByExample(sql);
	}

}
