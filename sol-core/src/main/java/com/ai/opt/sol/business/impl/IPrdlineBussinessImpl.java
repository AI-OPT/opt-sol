package com.ai.opt.sol.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.sdk.util.DateUtil;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.opt.sol.api.apisol.param.APISolPrdline;
import com.ai.opt.sol.api.apisol.param.APISolPrdlineQuery;
import com.ai.opt.sol.business.interfaces.IPrdlineBussiness;
import com.ai.opt.sol.dao.mapper.interfaces.SolPrdlineMapper;
import com.ai.opt.sol.dao.mapper.bo.SolPrdline;
import com.ai.opt.sol.dao.mapper.bo.SolPrdlineCriteria;

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
		solPrdline.setPrdlineCode(prdline.getPrdlineCode());
		solPrdlineMapper.insert(solPrdline);
	}
	@Override
	public List<SolPrdline> queryPrdlineName(APISolPrdlineQuery prdline) {
		SolPrdlineCriteria sql=new SolPrdlineCriteria();
		SolPrdlineCriteria.Criteria criteria=sql.createCriteria();
		if(!StringUtil.isBlank(prdline.getPrdlineCode())){
			criteria.andPrdlineCodeEqualTo(prdline.getPrdlineCode());
		}
		if(!StringUtil.isBlank(prdline.getPrdlineName())){
			criteria.andPrdlineNameEqualTo(prdline.getPrdlineName());
		}
		return solPrdlineMapper.selectByExample(sql);
	}
	@Override
	public List<SolPrdline> queryPrdlineId(String prdlineId) {
		if(StringUtil.isBlank(prdlineId)){
			throw new BusinessException("产品线id不能为空");
		}
		else {
			SolPrdlineCriteria sql=new SolPrdlineCriteria();
			SolPrdlineCriteria.Criteria criteria=sql.createCriteria();
			criteria.andPrdlineIdEqualTo(prdlineId);
			return solPrdlineMapper.selectByExample(sql);
		}
	}
	@Override
	public int modifyPrdlineSV(APISolPrdline prdline) {
		if(StringUtil.isBlank(prdline.getPrdlineId())){
			throw new BusinessException("产品线id不能为空");
		}else{
			SolPrdline solPrdline=new SolPrdline();
			solPrdline.setCreateTime(DateUtil.getTimestamp(prdline.getCreateTime(), DateUtil.YYYYMMDDHHMMSS));
			solPrdline.setIndustryCode(prdline.getIndustryCode());
			solPrdline.setPrdlineId(prdline.getPrdlineId());
			solPrdline.setPrdlineManager(prdline.getPrdlineManager());
			solPrdline.setPrdlineName(prdline.getPrdlineName());
			solPrdline.setPrdlineRemark(prdline.getPrdlineRemark());
			solPrdline.setUpdateTime(DateUtil.getTimestamp(prdline.getUpdateTime(), DateUtil.YYYYMMDDHHMMSS));
			solPrdline.setPrdlineCode(prdline.getPrdlineCode());
			SolPrdlineCriteria sql=new SolPrdlineCriteria();
			SolPrdlineCriteria.Criteria criteria=sql.createCriteria();
			criteria.andPrdlineIdEqualTo(solPrdline.getPrdlineId());
			return  solPrdlineMapper.updateByExampleSelective(solPrdline, sql);
		}
	}
	@Override
	public int delPrdlineId(APISolPrdline apiPrdline) {
		SolPrdlineCriteria sql=new SolPrdlineCriteria();
		SolPrdlineCriteria.Criteria criteria=sql.createCriteria();
		criteria.andPrdlineIdEqualTo(apiPrdline.getPrdlineId());
		return solPrdlineMapper.deleteByExample(sql);
	}

}
