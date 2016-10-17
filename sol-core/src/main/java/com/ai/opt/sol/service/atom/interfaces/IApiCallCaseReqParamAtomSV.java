package com.ai.opt.sol.service.atom.interfaces;

import java.util.List;

import com.ai.opt.sol.dao.mapper.bo.ApiCallCaseReqParam;

public interface IApiCallCaseReqParamAtomSV {

    void add(ApiCallCaseReqParam record);
    
    List<ApiCallCaseReqParam> getApiCallCaseReqParams(String caseId);
    
    

}
