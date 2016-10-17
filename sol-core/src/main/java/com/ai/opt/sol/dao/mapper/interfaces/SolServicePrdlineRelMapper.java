package com.ai.opt.sol.dao.mapper.interfaces;

import com.ai.opt.sol.dao.mapper.bo.SolServicePrdlineRel;
import com.ai.opt.sol.dao.mapper.bo.SolServicePrdlineRelCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SolServicePrdlineRelMapper {
    int countByExample(SolServicePrdlineRelCriteria example);

    int deleteByExample(SolServicePrdlineRelCriteria example);

    int deleteByPrimaryKey(String srvPrdlineId);

    int insert(SolServicePrdlineRel record);

    int insertSelective(SolServicePrdlineRel record);

    List<SolServicePrdlineRel> selectByExample(SolServicePrdlineRelCriteria example);

    SolServicePrdlineRel selectByPrimaryKey(String srvPrdlineId);

    int updateByExampleSelective(@Param("record") SolServicePrdlineRel record, @Param("example") SolServicePrdlineRelCriteria example);

    int updateByExample(@Param("record") SolServicePrdlineRel record, @Param("example") SolServicePrdlineRelCriteria example);

    int updateByPrimaryKeySelective(SolServicePrdlineRel record);

    int updateByPrimaryKey(SolServicePrdlineRel record);
}