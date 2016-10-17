package com.ai.opt.sol.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.opt.sol.dao.mapper.bo.ApiEnvSettings;
import com.ai.opt.sol.dao.mapper.bo.ApiEnvSettingsCriteria;
import com.ai.opt.sol.dao.mapper.factory.MapperFactory;
import com.ai.opt.sol.service.atom.interfaces.IApiEnvSettingsAtomSV;

@Component
public class ApiEnvSettingsAtomSVImpl implements IApiEnvSettingsAtomSV {

    @Override
    public int insert(ApiEnvSettings record) {
        return MapperFactory.getApiEnvSettingsMapper().insert(record);
    }

    @Override
    public List<ApiEnvSettings> selectByExample(ApiEnvSettingsCriteria example) {
        return MapperFactory.getApiEnvSettingsMapper().selectByExample(example);
    }

    @Override
    public int updateByPrimaryKeySelective(ApiEnvSettings record) {
        return MapperFactory.getApiEnvSettingsMapper().updateByPrimaryKeySelective(record);
    }

}
