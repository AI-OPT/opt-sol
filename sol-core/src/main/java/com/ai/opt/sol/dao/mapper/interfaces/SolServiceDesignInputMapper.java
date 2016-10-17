package com.ai.opt.sol.dao.mapper.interfaces;

import com.ai.opt.sol.dao.mapper.bo.SolServiceDesignInput;
import com.ai.opt.sol.dao.mapper.bo.SolServiceDesignInputCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SolServiceDesignInputMapper {
    int countByExample(SolServiceDesignInputCriteria example);

    int deleteByExample(SolServiceDesignInputCriteria example);

    int deleteByPrimaryKey(String inputId);

    int insert(SolServiceDesignInput record);

    int insertSelective(SolServiceDesignInput record);

    List<SolServiceDesignInput> selectByExample(SolServiceDesignInputCriteria example);

    SolServiceDesignInput selectByPrimaryKey(String inputId);

    int updateByExampleSelective(@Param("record") SolServiceDesignInput record, @Param("example") SolServiceDesignInputCriteria example);

    int updateByExample(@Param("record") SolServiceDesignInput record, @Param("example") SolServiceDesignInputCriteria example);

    int updateByPrimaryKeySelective(SolServiceDesignInput record);

    int updateByPrimaryKey(SolServiceDesignInput record);
}