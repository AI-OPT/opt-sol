package com.ai.opt.sol.dao.mapper.interfaces;

import com.ai.opt.sol.dao.mapper.bo.SolIndustry;
import com.ai.opt.sol.dao.mapper.bo.SolIndustryCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SolIndustryMapper {
    int countByExample(SolIndustryCriteria example);

    int deleteByExample(SolIndustryCriteria example);

    int deleteByPrimaryKey(String industryCode);

    int insert(SolIndustry record);

    int insertSelective(SolIndustry record);

    List<SolIndustry> selectByExample(SolIndustryCriteria example);

    SolIndustry selectByPrimaryKey(String industryCode);

    int updateByExampleSelective(@Param("record") SolIndustry record, @Param("example") SolIndustryCriteria example);

    int updateByExample(@Param("record") SolIndustry record, @Param("example") SolIndustryCriteria example);

    int updateByPrimaryKeySelective(SolIndustry record);

    int updateByPrimaryKey(SolIndustry record);
}