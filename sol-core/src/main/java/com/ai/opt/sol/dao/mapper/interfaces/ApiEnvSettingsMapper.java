package com.ai.opt.sol.dao.mapper.interfaces;

import com.ai.opt.sol.dao.mapper.bo.ApiEnvSettings;
import com.ai.opt.sol.dao.mapper.bo.ApiEnvSettingsCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApiEnvSettingsMapper {
    int countByExample(ApiEnvSettingsCriteria example);

    int deleteByExample(ApiEnvSettingsCriteria example);

    int deleteByPrimaryKey(String settingsId);

    int insert(ApiEnvSettings record);

    int insertSelective(ApiEnvSettings record);

    List<ApiEnvSettings> selectByExample(ApiEnvSettingsCriteria example);

    ApiEnvSettings selectByPrimaryKey(String settingsId);

    int updateByExampleSelective(@Param("record") ApiEnvSettings record, @Param("example") ApiEnvSettingsCriteria example);

    int updateByExample(@Param("record") ApiEnvSettings record, @Param("example") ApiEnvSettingsCriteria example);

    int updateByPrimaryKeySelective(ApiEnvSettings record);

    int updateByPrimaryKey(ApiEnvSettings record);
}