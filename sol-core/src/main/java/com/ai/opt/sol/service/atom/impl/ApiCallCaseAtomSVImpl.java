package com.ai.opt.sol.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.opt.sdk.util.StringUtil;
import com.ai.opt.sol.api.sandbox.param.APICallCaseQuery;
import com.ai.opt.sol.dao.mapper.bo.ApiCallCase;
import com.ai.opt.sol.dao.mapper.bo.ApiCallCaseCriteria;
import com.ai.opt.sol.dao.mapper.bo.ApiCallCaseCriteria.Criteria;
import com.ai.opt.sol.dao.mapper.factory.MapperFactory;
import com.ai.opt.sol.service.atom.interfaces.IApiCallCaseAtomSV;

@Component
public class ApiCallCaseAtomSVImpl implements IApiCallCaseAtomSV {

    @Override
    public void add(ApiCallCase record) {
        MapperFactory.getApiCallCaseMapper().insert(record);
    }

    @Override
    public void update(ApiCallCase record) {
        MapperFactory.getApiCallCaseMapper().updateByPrimaryKeySelective(record);
    }

    @Override
    public ApiCallCase getApiCallCase(String caseId) {
        return MapperFactory.getApiCallCaseMapper().selectByPrimaryKey(caseId);
    }

    @Override
    public List<ApiCallCase> getApiCallCases(String interfaceName, String method) {
        ApiCallCaseCriteria sql = new ApiCallCaseCriteria();
        sql.setOrderByClause(" test_time desc");
        sql.or().andInterfaceNameEqualTo(interfaceName).andMethodEqualTo(method);
        
        return MapperFactory.getApiCallCaseMapper().selectByExample(sql);
    }

    @Override
    public int getCount(APICallCaseQuery query) {
        ApiCallCaseCriteria sql = new ApiCallCaseCriteria(); 
        Criteria criteria =sql.or();
        if(!StringUtil.isBlank(query.getInterfaceName())){
            criteria.andInterfaceNameEqualTo(query.getInterfaceName());
        }
        if(!StringUtil.isBlank(query.getMethod())){
            criteria.andMethodEqualTo(query.getMethod());
        }
        if(!StringUtil.isBlank(query.getTester())){
            criteria.andTesterLike("%"+query.getTester()+"%");
        }
        if(!StringUtil.isBlank(query.getCaseTag())){
            criteria.andCaseTagLike("%"+query.getCaseTag()+"%");
        }
        return MapperFactory.getApiCallCaseMapper().countByExample(sql);
    }

    @Override
    public List<ApiCallCase> getApiCallCases(APICallCaseQuery query) {
        ApiCallCaseCriteria sql = new ApiCallCaseCriteria();
        sql.setOrderByClause(" test_time desc");
        Criteria criteria =sql.or();
        if(!StringUtil.isBlank(query.getInterfaceName())){
            criteria.andInterfaceNameEqualTo(query.getInterfaceName());
        }
        if(!StringUtil.isBlank(query.getMethod())){
            criteria.andMethodEqualTo(query.getMethod());
        }
        if(!StringUtil.isBlank(query.getTester())){
            criteria.andTesterLike("%"+query.getTester()+"%");
        }
        if(!StringUtil.isBlank(query.getCaseTag())){
            criteria.andCaseTagLike("%"+query.getCaseTag()+"%");
        }
        sql.setLimitStart(query.getPageInfo().getStartRowIndex()-1);
        sql.setLimitEnd(query.getPageInfo().getPageSize());
        return MapperFactory.getApiCallCaseMapper().selectByExample(sql);
    }

}
