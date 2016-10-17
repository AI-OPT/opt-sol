package com.ai.opt.sol.service.atom.interfaces;

import java.util.List;

import com.ai.opt.sol.dao.mapper.bo.ApiEnvSettings;
import com.ai.opt.sol.dao.mapper.bo.ApiEnvSettingsCriteria;

public interface IApiEnvSettingsAtomSV {

    int insert(ApiEnvSettings record);

    int updateByPrimaryKeySelective(ApiEnvSettings record);

    List<ApiEnvSettings> selectByExample(ApiEnvSettingsCriteria example);

}
