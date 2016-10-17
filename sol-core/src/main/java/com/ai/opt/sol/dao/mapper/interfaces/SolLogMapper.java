package com.ai.opt.sol.dao.mapper.interfaces;

import com.ai.opt.sol.dao.mapper.bo.SolLog;
import com.ai.opt.sol.dao.mapper.bo.SolLogCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SolLogMapper {
    int countByExample(SolLogCriteria example);

    int deleteByExample(SolLogCriteria example);

    int deleteByPrimaryKey(String logId);

    int insert(SolLog record);

    int insertSelective(SolLog record);

    List<SolLog> selectByExample(SolLogCriteria example);

    SolLog selectByPrimaryKey(String logId);

    int updateByExampleSelective(@Param("record") SolLog record, @Param("example") SolLogCriteria example);

    int updateByExample(@Param("record") SolLog record, @Param("example") SolLogCriteria example);

    int updateByPrimaryKeySelective(SolLog record);

    int updateByPrimaryKey(SolLog record);
}