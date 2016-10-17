package com.ai.opt.sol.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.opt.sol.dao.mapper.bo.ApiCallSettingReq;
import com.ai.opt.sol.dao.mapper.bo.ApiCallSettingReqCriteria;
import com.ai.opt.sol.dao.mapper.factory.MapperFactory;
import com.ai.opt.sol.service.atom.interfaces.IApiCallSettingReqAtomSV;

@Component
public class ApiCallSettingReqAtomSVImpl implements IApiCallSettingReqAtomSV {

    @Override
    public void add(ApiCallSettingReq record) {
        MapperFactory.getApiCallSettingReqMapper().insert(record);
    }

    @Override
    public void update(ApiCallSettingReq record) {
        MapperFactory.getApiCallSettingReqMapper().updateByPrimaryKeySelective(record);
    }

    @Override
    public ApiCallSettingReq getApiCallSettingReq(String paramId) {
        return MapperFactory.getApiCallSettingReqMapper().selectByPrimaryKey(paramId);
    }

    @Override
    public List<ApiCallSettingReq> getApiCallSettingReqs(String interfaceName, String method) {
        ApiCallSettingReqCriteria sql = new ApiCallSettingReqCriteria();
        sql.or().andInterfaceNameEqualTo(interfaceName).andMethodEqualTo(method);
        sql.setOrderByClause(" sort asc");
        return MapperFactory.getApiCallSettingReqMapper().selectByExample(sql);
    }

    @Override
    public ApiCallSettingReq getApiCallSettingReq(String interfaceName, String method,
            String paramName) {
        ApiCallSettingReqCriteria sql = new ApiCallSettingReqCriteria();
        sql.or().andInterfaceNameEqualTo(interfaceName).andMethodEqualTo(method)
                .andParamNameEqualTo(paramName);
        List<ApiCallSettingReq> ls = MapperFactory.getApiCallSettingReqMapper()
                .selectByExample(sql);
        return CollectionUtil.isEmpty(ls) ? null : ls.get(0);
    }

    @Override
    public void delete(String settingId) {
        ApiCallSettingReqCriteria sql = new ApiCallSettingReqCriteria();
        sql.or().andSettingIdEqualTo(settingId);
        MapperFactory.getApiCallSettingReqMapper().deleteByExample(sql);
    }

}
