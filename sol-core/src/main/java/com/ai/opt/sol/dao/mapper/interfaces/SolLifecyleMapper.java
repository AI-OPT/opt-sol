package com.ai.opt.sol.dao.mapper.interfaces;

import com.ai.opt.sol.dao.mapper.bo.SolLifecyle;
import com.ai.opt.sol.dao.mapper.bo.SolLifecyleCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SolLifecyleMapper {
    int countByExample(SolLifecyleCriteria example);

    int deleteByExample(SolLifecyleCriteria example);

    int deleteByPrimaryKey(String serviceGlobalId);

    int insert(SolLifecyle record);

    int insertSelective(SolLifecyle record);

    List<SolLifecyle> selectByExample(SolLifecyleCriteria example);

    SolLifecyle selectByPrimaryKey(String serviceGlobalId);

    int updateByExampleSelective(@Param("record") SolLifecyle record, @Param("example") SolLifecyleCriteria example);

    int updateByExample(@Param("record") SolLifecyle record, @Param("example") SolLifecyleCriteria example);

    int updateByPrimaryKeySelective(SolLifecyle record);

    int updateByPrimaryKey(SolLifecyle record);
}