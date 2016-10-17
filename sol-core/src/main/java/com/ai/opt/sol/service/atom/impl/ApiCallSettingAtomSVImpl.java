package com.ai.opt.sol.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.opt.sol.dao.mapper.bo.ApiCallSetting;
import com.ai.opt.sol.dao.mapper.bo.ApiCallSettingCriteria;
import com.ai.opt.sol.dao.mapper.factory.MapperFactory;
import com.ai.opt.sol.service.atom.interfaces.IApiCallSettingAtomSV;

@Component
public class ApiCallSettingAtomSVImpl implements IApiCallSettingAtomSV {

    @Override
    public void add(ApiCallSetting record) {
        MapperFactory.getApiCallSettingMapper().insert(record);
    }

    @Override
    public void update(ApiCallSetting record) {
        MapperFactory.getApiCallSettingMapper().updateByPrimaryKeySelective(record);
    }

    @Override
    public ApiCallSetting getApiCallSetting(String settingId) {
        return MapperFactory.getApiCallSettingMapper().selectByPrimaryKey(settingId);
    }

    @Override
    public ApiCallSetting getApiCallSetting(String appName, String interfaceName, String method) {
        ApiCallSettingCriteria sql = new ApiCallSettingCriteria();
        sql.or().andAppNameEqualTo(appName).andInterfaceNameEqualTo(interfaceName)
                .andMethodEqualTo(method);
        List<ApiCallSetting> list = MapperFactory.getApiCallSettingMapper().selectByExample(sql);
        return CollectionUtil.isEmpty(list) ? null : list.get(0);
    }

    @Override
    public int getApiCallSettingCount(String appName) {
        ApiCallSettingCriteria sql = new ApiCallSettingCriteria();
        sql.or().andAppNameEqualTo(appName);
        List<ApiCallSetting> list = MapperFactory.getApiCallSettingMapper().selectByExample(sql);
        return CollectionUtil.isEmpty(list) ? 0 : list.size();
    }

    @Override
    public List<ApiCallSetting> getApiCallSettings(String appName) {
        ApiCallSettingCriteria sql = new ApiCallSettingCriteria();
        sql.or().andAppNameEqualTo(appName);
        List<ApiCallSetting> list = MapperFactory.getApiCallSettingMapper().selectByExample(sql);
        return list;
    }

}
