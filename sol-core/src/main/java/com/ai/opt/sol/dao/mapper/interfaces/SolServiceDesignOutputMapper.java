package com.ai.opt.sol.dao.mapper.interfaces;

import com.ai.opt.sol.dao.mapper.bo.SolServiceDesignOutput;
import com.ai.opt.sol.dao.mapper.bo.SolServiceDesignOutputCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SolServiceDesignOutputMapper {
    int countByExample(SolServiceDesignOutputCriteria example);

    int deleteByExample(SolServiceDesignOutputCriteria example);

    int deleteByPrimaryKey(String outputId);

    int insert(SolServiceDesignOutput record);

    int insertSelective(SolServiceDesignOutput record);

    List<SolServiceDesignOutput> selectByExample(SolServiceDesignOutputCriteria example);

    SolServiceDesignOutput selectByPrimaryKey(String outputId);

    int updateByExampleSelective(@Param("record") SolServiceDesignOutput record, @Param("example") SolServiceDesignOutputCriteria example);

    int updateByExample(@Param("record") SolServiceDesignOutput record, @Param("example") SolServiceDesignOutputCriteria example);

    int updateByPrimaryKeySelective(SolServiceDesignOutput record);

    int updateByPrimaryKey(SolServiceDesignOutput record);
}