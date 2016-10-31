package com.ai.opt.sol.business.interfaces;

import java.util.List;

import com.ai.opt.sol.api.apisol.param.APISolServiceVersion;
import com.ai.opt.sol.dao.mapper.bo.SolServiceVersion;

public interface ISolServiceVersionBussiness {
	public int countBySrvId(String srvApiId);
	public void insertSrvVersion(APISolServiceVersion srvVersion);
	public List<SolServiceVersion> queryByApiId(String srvApiId);
	public List<SolServiceVersion> queryBySrvVertion(String serviceVertionId);
	
}
