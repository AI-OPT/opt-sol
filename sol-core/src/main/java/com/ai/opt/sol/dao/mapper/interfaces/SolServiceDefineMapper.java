package com.ai.opt.sol.dao.mapper.interfaces;

import com.ai.opt.sol.dao.mapper.bo.SolServiceDefine;
import com.ai.opt.sol.dao.mapper.bo.SolServiceDefineCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SolServiceDefineMapper {
    int countByExample(SolServiceDefineCriteria example);

    int deleteByExample(SolServiceDefineCriteria example);

    int deleteByPrimaryKey(String srvApiId);

    int insert(SolServiceDefine record);

    int insertSelective(SolServiceDefine record);

    List<SolServiceDefine> selectByExample(SolServiceDefineCriteria example);

    SolServiceDefine selectByPrimaryKey(String srvApiId);

    int updateByExampleSelective(@Param("record") SolServiceDefine record, @Param("example") SolServiceDefineCriteria example);

    int updateByExample(@Param("record") SolServiceDefine record, @Param("example") SolServiceDefineCriteria example);

    int updateByPrimaryKeySelective(SolServiceDefine record);

    int updateByPrimaryKey(SolServiceDefine record);
}