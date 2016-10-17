package com.ai.opt.sol.dao.mapper.interfaces;

import com.ai.opt.sol.dao.mapper.bo.ApiCallSetting;
import com.ai.opt.sol.dao.mapper.bo.ApiCallSettingCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApiCallSettingMapper {
    int countByExample(ApiCallSettingCriteria example);

    int deleteByExample(ApiCallSettingCriteria example);

    int deleteByPrimaryKey(String settingId);

    int insert(ApiCallSetting record);

    int insertSelective(ApiCallSetting record);

    List<ApiCallSetting> selectByExample(ApiCallSettingCriteria example);

    ApiCallSetting selectByPrimaryKey(String settingId);

    int updateByExampleSelective(@Param("record") ApiCallSetting record, @Param("example") ApiCallSettingCriteria example);

    int updateByExample(@Param("record") ApiCallSetting record, @Param("example") ApiCallSettingCriteria example);

    int updateByPrimaryKeySelective(ApiCallSetting record);

    int updateByPrimaryKey(ApiCallSetting record);
}