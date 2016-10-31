package com.ai.opt.sol.business.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.sdk.util.DateUtil;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.opt.sol.api.apisol.param.APISolServiceDefine;
import com.ai.opt.sol.business.interfaces.ISolServiceDefineBussiness;
import com.ai.opt.sol.dao.mapper.bo.SolServiceDefine;
import com.ai.opt.sol.dao.mapper.bo.SolServiceDefineCriteria;
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
	@Override
	public List<SolServiceDefine> queryServiceById(String srvApiId) {
		
		if(!StringUtils.isBlank(srvApiId)){
			SolServiceDefineCriteria sql=new SolServiceDefineCriteria();
			SolServiceDefineCriteria.Criteria criteria=sql.createCriteria();
			criteria.andSrvApiIdEqualTo(srvApiId);
			return solServiceDefineMapper.selectByExample(sql);
		}
		else {
			return null;
		}
	}
	@Override
	public List<SolServiceDefine> queryServiceByParams(APISolServiceDefine solServiceDefine) {
		SolServiceDefineCriteria sql=new SolServiceDefineCriteria();
		SolServiceDefineCriteria.Criteria criteria=sql.createCriteria();
		if(!StringUtils.isBlank(solServiceDefine.getSrvApiName()))
			criteria.andSrvApiNameEqualTo(solServiceDefine.getSrvApiName());
		if(!StringUtils.isBlank(solServiceDefine.getSrvCenter()))
			criteria.andSrvCenterEqualTo(solServiceDefine.getSrvCenter());
		if(!StringUtils.isBlank(solServiceDefine.getSrvCenter()))
			criteria.andSrvClassEqualTo(solServiceDefine.getSrvCenter());
		if(!StringUtils.isBlank(solServiceDefine.getSrvApiId()))
			criteria.andSrvApiIdEqualTo(solServiceDefine.getSrvApiId());
		return solServiceDefineMapper.selectByExample(sql);				
	}
	@Override
	public int modifySrvDefine(APISolServiceDefine solServiceDefine) {
		if(StringUtil.isBlank(solServiceDefine.getSrvApiId())){
			throw new BusinessException("服务id不能为空");
		}else{
			SolServiceDefine solSrvDefine=new SolServiceDefine();
			solSrvDefine.setCreateTime(DateUtil.getTimestamp(solServiceDefine.getCreateTime(), DateUtil.YYYYMMDDHHMMSS));
			solSrvDefine.setSrvApiId(solServiceDefine.getSrvApiId());
			solSrvDefine.setSrvApiName(solServiceDefine.getSrvApiName());
			solSrvDefine.setSrvCategoryId(solServiceDefine.getSrvCategoryId());
			solSrvDefine.setSrvCenter(solServiceDefine.getSrvCenter());
			solSrvDefine.setSrvClass(solServiceDefine.getSrvClass());
			solSrvDefine.setSrvRemark(solServiceDefine.getSrvRemark());
			solSrvDefine.setUpdateTime(DateUtil.getTimestamp(solServiceDefine.getUpdateTime(), DateUtil.YYYYMMDDHHMMSS));
			SolServiceDefineCriteria sql=new SolServiceDefineCriteria();
			SolServiceDefineCriteria.Criteria criteria=sql.createCriteria();
			criteria.andSrvApiIdEqualTo(solServiceDefine.getSrvApiId());
			return solServiceDefineMapper.updateByExampleSelective(solSrvDefine, sql);
		}
	}

}
