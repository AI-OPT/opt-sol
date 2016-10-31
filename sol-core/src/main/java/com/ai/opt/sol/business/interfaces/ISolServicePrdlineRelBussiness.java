package com.ai.opt.sol.business.interfaces;

import java.util.List;

import com.ai.opt.sol.api.apisol.param.APISolServicePrdlineRel;
import com.ai.opt.sol.dao.mapper.bo.SolServiceDefine;
import com.ai.opt.sol.dao.mapper.bo.SolServicePrdlineRel;

public interface ISolServicePrdlineRelBussiness {
	public void insertSrvPrdRel(APISolServicePrdlineRel srvPrdRel);
	public List<SolServiceDefine> querySrvPrdRel(String prdlineId);
	public List<SolServicePrdlineRel> queryPrdlineSrv(String srvApiId);
}
