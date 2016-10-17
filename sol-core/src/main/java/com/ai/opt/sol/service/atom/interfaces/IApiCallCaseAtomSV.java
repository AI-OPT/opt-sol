package com.ai.opt.sol.service.atom.interfaces;

import java.util.List;

import com.ai.opt.sol.api.sandbox.param.APICallCaseQuery;
import com.ai.opt.sol.dao.mapper.bo.ApiCallCase;

public interface IApiCallCaseAtomSV {

    void add(ApiCallCase record);

    void update(ApiCallCase record);

    ApiCallCase getApiCallCase(String caseId);

    List<ApiCallCase> getApiCallCases(String interfaceName, String method);
    
    int getCount(APICallCaseQuery query);
    
    List<ApiCallCase> getApiCallCases(APICallCaseQuery query);

}
