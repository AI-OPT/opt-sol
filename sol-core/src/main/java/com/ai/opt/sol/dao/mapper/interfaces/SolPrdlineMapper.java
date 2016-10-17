package com.ai.opt.sol.dao.mapper.interfaces;

import com.ai.opt.sol.dao.mapper.bo.SolPrdline;
import com.ai.opt.sol.dao.mapper.bo.SolPrdlineCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SolPrdlineMapper {
    int countByExample(SolPrdlineCriteria example);

    int deleteByExample(SolPrdlineCriteria example);

    int deleteByPrimaryKey(String prdlineId);

    int insert(SolPrdline record);

    int insertSelective(SolPrdline record);

    List<SolPrdline> selectByExample(SolPrdlineCriteria example);

    SolPrdline selectByPrimaryKey(String prdlineId);

    int updateByExampleSelective(@Param("record") SolPrdline record, @Param("example") SolPrdlineCriteria example);

    int updateByExample(@Param("record") SolPrdline record, @Param("example") SolPrdlineCriteria example);

    int updateByPrimaryKeySelective(SolPrdline record);

    int updateByPrimaryKey(SolPrdline record);
}