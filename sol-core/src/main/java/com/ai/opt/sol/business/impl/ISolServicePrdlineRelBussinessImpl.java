package com.ai.opt.sol.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.sdk.util.DateUtil;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.opt.sol.api.apisol.param.APISolServicePrdlineRel;
import com.ai.opt.sol.business.interfaces.IPrdlineBussiness;
import com.ai.opt.sol.business.interfaces.ISolServiceDefineBussiness;
import com.ai.opt.sol.business.interfaces.ISolServicePrdlineRelBussiness;
import com.ai.opt.sol.dao.mapper.bo.SolPrdlineCriteria;
import com.ai.opt.sol.dao.mapper.bo.SolServiceDefine;
import com.ai.opt.sol.dao.mapper.bo.SolServicePrdlineRel;
import com.ai.opt.sol.dao.mapper.bo.SolServicePrdlineRelCriteria;
import com.ai.opt.sol.dao.mapper.interfaces.SolServicePrdlineRelMapper;

@Service
@Transactional()
public class ISolServicePrdlineRelBussinessImpl implements ISolServicePrdlineRelBussiness{
	@Autowired
	SolServicePrdlineRelMapper solServicePrdlineRelMapper;
	@Autowired
	ISolServiceDefineBussiness sevDefineBussiness;
	@Override
	public void insertSrvPrdRel(APISolServicePrdlineRel srvPrdRel) {
		SolServicePrdlineRel srvPrdlineRel=new SolServicePrdlineRel();
		srvPrdlineRel.setCreateTime(DateUtil.getTimestamp(srvPrdRel.getCreateTime(), DateUtil.YYYYMMDDHHMMSS));
		srvPrdlineRel.setPrdlineId(srvPrdRel.getPrdlineId());
		srvPrdlineRel.setPrdVersion(srvPrdRel.getPrdVersionId());
		srvPrdlineRel.setSrvApiId(srvPrdRel.getSrvApiId());
		srvPrdlineRel.setSrvPrdlineId(srvPrdRel.getSrvPrdlineId());
		srvPrdlineRel.setSrvVersionId(srvPrdRel.getSrvVersionId());
		srvPrdlineRel.setUpdateTime(DateUtil.getTimestamp(srvPrdRel.getUpdateTime(), DateUtil.YYYYMMDDHHMMSS));
		solServicePrdlineRelMapper.insert(srvPrdlineRel);
	}

	@Override
	public List<SolServiceDefine> querySrvPrdRel(String prdlineId) {
		
		if(StringUtil.isBlank(prdlineId)){
			throw new BusinessException("产品线id不能为空");
		}else{
			List<SolServicePrdlineRel> srvPrdlineRellists=new ArrayList<SolServicePrdlineRel>();
			List<SolServiceDefine> serviceDefines=new ArrayList<SolServiceDefine>();
			SolServicePrdlineRelCriteria sql=new SolServicePrdlineRelCriteria();
			SolServicePrdlineRelCriteria.Criteria criteria=sql.createCriteria();
			criteria.andPrdlineIdEqualTo(prdlineId);
			srvPrdlineRellists=solServicePrdlineRelMapper.selectByExample(sql);
			for(SolServicePrdlineRel srvPrdlineRel:srvPrdlineRellists){
				if(!StringUtil.isBlank(srvPrdlineRel.getSrvApiId())){
					List<SolServiceDefine> subServiceDefines=new ArrayList<SolServiceDefine>();
					subServiceDefines=sevDefineBussiness.queryServiceById(srvPrdlineRel.getSrvApiId());
					serviceDefines.addAll(subServiceDefines);
				}
			}
			return serviceDefines;
		}
	}

	@Override
	public List<SolServicePrdlineRel> queryPrdlineSrv(String srvApiId) {
		
		SolServicePrdlineRelCriteria sql=new SolServicePrdlineRelCriteria();
		SolServicePrdlineRelCriteria.Criteria criteria=sql.createCriteria();
		criteria.andPrdlineIdEqualTo(srvApiId);
		return solServicePrdlineRelMapper.selectByExample(sql);
	}




}
