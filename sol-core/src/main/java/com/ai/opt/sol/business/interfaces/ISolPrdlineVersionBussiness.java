package com.ai.opt.sol.business.interfaces;

import java.util.List;

import com.ai.opt.sol.api.apisol.param.APISolPrdline;
import com.ai.opt.sol.api.apisol.param.APISolPrdlineVersion;
import com.ai.opt.sol.dao.mapper.bo.SolPrdlineVersion;

public interface ISolPrdlineVersionBussiness {
	public void insertPrdlineVersion(APISolPrdlineVersion prdlineVersion);
	public List<SolPrdlineVersion> queryByPrdversionId(String prdVersionId);
	public int modifyPrdVersion(APISolPrdlineVersion prdlineVersion);
	public List<SolPrdlineVersion> queryBySolPrdline(APISolPrdline solPrdline);
	public List<SolPrdlineVersion> queryByPrdId(String prdlineId);
}
