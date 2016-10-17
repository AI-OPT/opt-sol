package com.ai.opt.sol.dao.mapper.interfaces;

import com.ai.opt.sol.dao.mapper.bo.ApiCallSettingReq;
import com.ai.opt.sol.dao.mapper.bo.ApiCallSettingReqCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApiCallSettingReqMapper {
    int countByExample(ApiCallSettingReqCriteria example);

    int deleteByExample(ApiCallSettingReqCriteria example);

    int deleteByPrimaryKey(String settingReqId);

    int insert(ApiCallSettingReq record);

    int insertSelective(ApiCallSettingReq record);

    List<ApiCallSettingReq> selectByExample(ApiCallSettingReqCriteria example);

    ApiCallSettingReq selectByPrimaryKey(String settingReqId);

    int updateByExampleSelective(@Param("record") ApiCallSettingReq record, @Param("example") ApiCallSettingReqCriteria example);

    int updateByExample(@Param("record") ApiCallSettingReq record, @Param("example") ApiCallSettingReqCriteria example);

    int updateByPrimaryKeySelective(ApiCallSettingReq record);

    int updateByPrimaryKey(ApiCallSettingReq record);
}