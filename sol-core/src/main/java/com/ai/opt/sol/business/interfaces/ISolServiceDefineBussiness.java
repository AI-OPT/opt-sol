package com.ai.opt.sol.business.interfaces;

import java.util.List;

import com.ai.opt.sol.api.apisol.param.APISolServiceDefine;
import com.ai.opt.sol.dao.mapper.bo.SolServiceDefine;

public interface ISolServiceDefineBussiness {
	public void insertServiceDefine(APISolServiceDefine solServiceDefine);
	public List<SolServiceDefine> queryServiceById(String srvApiId);
	public List<SolServiceDefine> queryServiceByParams(APISolServiceDefine solServiceDefine);
	public int modifySrvDefine(APISolServiceDefine solServiceDefine);
}
