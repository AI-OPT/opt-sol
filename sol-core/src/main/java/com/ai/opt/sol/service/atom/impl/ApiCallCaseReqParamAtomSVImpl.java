package com.ai.opt.sol.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.opt.sol.dao.mapper.bo.ApiCallCaseReqParam;
import com.ai.opt.sol.dao.mapper.bo.ApiCallCaseReqParamCriteria;
import com.ai.opt.sol.dao.mapper.factory.MapperFactory;
import com.ai.opt.sol.service.atom.interfaces.IApiCallCaseReqParamAtomSV;

@Component
public class ApiCallCaseReqParamAtomSVImpl implements IApiCallCaseReqParamAtomSV {

    @Override
    public void add(ApiCallCaseReqParam record) {
        MapperFactory.getApiCallCaseReqParamMapper().insert(record);
    }

    @Override
    public List<ApiCallCaseReqParam> getApiCallCaseReqParams(String caseId) {
        ApiCallCaseReqParamCriteria sql = new ApiCallCaseReqParamCriteria();
        sql.setOrderByClause(" sort asc");
        sql.or().andCaseIdEqualTo(caseId);
        return MapperFactory.getApiCallCaseReqParamMapper().selectByExample(sql);
    }

}
