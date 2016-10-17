package com.ai.opt.sol.dao.mapper.interfaces;

import com.ai.opt.sol.dao.mapper.bo.SolServiceVersion;
import com.ai.opt.sol.dao.mapper.bo.SolServiceVersionCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SolServiceVersionMapper {
    int countByExample(SolServiceVersionCriteria example);

    int deleteByExample(SolServiceVersionCriteria example);

    int deleteByPrimaryKey(String srvVersionId);

    int insert(SolServiceVersion record);

    int insertSelective(SolServiceVersion record);

    List<SolServiceVersion> selectByExample(SolServiceVersionCriteria example);

    SolServiceVersion selectByPrimaryKey(String srvVersionId);

    int updateByExampleSelective(@Param("record") SolServiceVersion record, @Param("example") SolServiceVersionCriteria example);

    int updateByExample(@Param("record") SolServiceVersion record, @Param("example") SolServiceVersionCriteria example);

    int updateByPrimaryKeySelective(SolServiceVersion record);

    int updateByPrimaryKey(SolServiceVersion record);
}