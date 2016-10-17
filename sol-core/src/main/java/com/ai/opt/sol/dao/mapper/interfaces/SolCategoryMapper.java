package com.ai.opt.sol.dao.mapper.interfaces;

import com.ai.opt.sol.dao.mapper.bo.SolCategory;
import com.ai.opt.sol.dao.mapper.bo.SolCategoryCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SolCategoryMapper {
    int countByExample(SolCategoryCriteria example);

    int deleteByExample(SolCategoryCriteria example);

    int deleteByPrimaryKey(String categoryId);

    int insert(SolCategory record);

    int insertSelective(SolCategory record);

    List<SolCategory> selectByExample(SolCategoryCriteria example);

    SolCategory selectByPrimaryKey(String categoryId);

    int updateByExampleSelective(@Param("record") SolCategory record, @Param("example") SolCategoryCriteria example);

    int updateByExample(@Param("record") SolCategory record, @Param("example") SolCategoryCriteria example);

    int updateByPrimaryKeySelective(SolCategory record);

    int updateByPrimaryKey(SolCategory record);
}