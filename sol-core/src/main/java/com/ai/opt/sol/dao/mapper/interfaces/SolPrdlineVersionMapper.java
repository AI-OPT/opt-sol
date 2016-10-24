package com.ai.opt.sol.dao.mapper.interfaces;

import com.ai.opt.sol.dao.mapper.bo.SolPrdlineVersion;
import com.ai.opt.sol.dao.mapper.bo.SolPrdlineVersionCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SolPrdlineVersionMapper {
    int countByExample(SolPrdlineVersionCriteria example);

    int deleteByExample(SolPrdlineVersionCriteria example);

    int deleteByPrimaryKey(String prdlineVersionId);

    int insert(SolPrdlineVersion record);

    int insertSelective(SolPrdlineVersion record);

    List<SolPrdlineVersion> selectByExample(SolPrdlineVersionCriteria example);

    SolPrdlineVersion selectByPrimaryKey(String prdlineVersionId);

    int updateByExampleSelective(@Param("record") SolPrdlineVersion record, @Param("example") SolPrdlineVersionCriteria example);

    int updateByExample(@Param("record") SolPrdlineVersion record, @Param("example") SolPrdlineVersionCriteria example);

    int updateByPrimaryKeySelective(SolPrdlineVersion record);

    int updateByPrimaryKey(SolPrdlineVersion record);
}