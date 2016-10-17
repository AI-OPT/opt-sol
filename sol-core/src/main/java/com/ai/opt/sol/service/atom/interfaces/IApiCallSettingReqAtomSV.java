package com.ai.opt.sol.service.atom.interfaces;

import java.util.List;

import com.ai.opt.sol.dao.mapper.bo.ApiCallSettingReq;

public interface IApiCallSettingReqAtomSV {

    void add(ApiCallSettingReq record);

    void update(ApiCallSettingReq record);

    void delete(String settingId);

    ApiCallSettingReq getApiCallSettingReq(String paramId);

    List<ApiCallSettingReq> getApiCallSettingReqs(String interfaceName, String method);

    ApiCallSettingReq getApiCallSettingReq(String interfaceName, String method, String paramName);

}
