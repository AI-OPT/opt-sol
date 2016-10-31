package com.ai.opt.sol.business.interfaces;

import java.util.List;

import com.ai.opt.sol.api.apisol.param.APISolPrdline;
import com.ai.opt.sol.api.apisol.param.APISolPrdlineQuery;
import com.ai.opt.sol.dao.mapper.bo.SolPrdline;

public interface IPrdlineBussiness {
	public void insertPrdline(APISolPrdline prdline);
	public List<SolPrdline> queryPrdlineName(APISolPrdlineQuery prdline);
	public List<SolPrdline> queryPrdlineId(String prdlineId);
	public int modifyPrdlineSV(APISolPrdline prdline);
	public int delPrdlineId(APISolPrdline apiPrdline);

}
