package com.ai.opt.sol.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.sdk.util.DateUtil;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.opt.sol.api.apisol.param.APISolPrdline;
import com.ai.opt.sol.api.apisol.param.APISolPrdlineVersion;
import com.ai.opt.sol.business.interfaces.ISolPrdlineVersionBussiness;
import com.ai.opt.sol.dao.mapper.bo.SolPrdlineVersion;
import com.ai.opt.sol.dao.mapper.bo.SolPrdlineVersionCriteria;
import com.ai.opt.sol.dao.mapper.interfaces.SolPrdlineVersionMapper;
import com.sun.org.apache.bcel.internal.generic.NEW;

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
	@Override
	public List<SolPrdlineVersion> queryByPrdversionId(String prdVersionId) {
		SolPrdlineVersionCriteria sql=new SolPrdlineVersionCriteria();
		SolPrdlineVersionCriteria.Criteria criteria=sql.createCriteria();
		criteria.andPrdlineVersionEqualTo(prdVersionId);
		return solPrdlineVersionMapper.selectByExample(sql);
	}
	@Override
	public int modifyPrdVersion(APISolPrdlineVersion prdlineVersion) {
		if(StringUtil.isBlank(prdlineVersion.getPrdlineVersionId())){
			throw new BusinessException("产品线id不能为空");
		}else{
			SolPrdlineVersion solPrdVersion=new SolPrdlineVersion();
			solPrdVersion.setCreateTime(DateUtil.getTimestamp(prdlineVersion.getCreateTime(), DateUtil.YYYYMMDDHHMMSS));
			solPrdVersion.setPrdlineId(prdlineVersion.getPrdlineId());
			solPrdVersion.setPrdlineVersion(prdlineVersion.getPrdlineVersion());
			solPrdVersion.setPrdlineVersionId(prdlineVersion.getPrdlineVersionId());
			solPrdVersion.setVersionRemark(prdlineVersion.getVersionRemark());
			SolPrdlineVersionCriteria sql=new SolPrdlineVersionCriteria();
			SolPrdlineVersionCriteria.Criteria criteria=sql.createCriteria();
			criteria.andPrdlineVersionEqualTo(prdlineVersion.getPrdlineVersionId());
			return solPrdlineVersionMapper.updateByExampleSelective(solPrdVersion, sql);
		}

	}
	@Override
	public List<SolPrdlineVersion> queryBySolPrdline(APISolPrdline solPrdline) {	
		SolPrdlineVersionCriteria sql=new SolPrdlineVersionCriteria();
		SolPrdlineVersionCriteria.Criteria criteria=sql.createCriteria();
		List<SolPrdlineVersion> solPrdlineVertions=new ArrayList<SolPrdlineVersion>();
		if(!StringUtil.isBlank(solPrdline.getPrdlineId())){
			criteria.andPrdlineIdEqualTo(solPrdline.getPrdlineId());
			solPrdlineVertions=solPrdlineVersionMapper.selectByExample(sql);
		}
		return solPrdlineVertions;
	}
	@Override
	public List<SolPrdlineVersion> queryByPrdId(String prdlineId) {
		SolPrdlineVersionCriteria sql=new SolPrdlineVersionCriteria();
		SolPrdlineVersionCriteria.Criteria criteria=sql.createCriteria();
		criteria.andPrdlineIdEqualTo(prdlineId);
		return solPrdlineVersionMapper.selectByExample(sql);
	}

}
