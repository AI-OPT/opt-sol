package com.ai.opt.sol.api.sandbox;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.sol.api.sandbox.param.APICallCase;
import com.ai.opt.sol.api.sandbox.param.APICallCaseQuery;
import com.ai.opt.sol.api.sandbox.param.APICallCaseReqParam;
import com.ai.opt.sol.api.sandbox.param.APICallSetting;
import com.ai.opt.sol.api.sandbox.param.APIRest;
import com.ai.opt.sol.api.sandbox.param.APIRestTestReq;

@Path("/SandBox")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface ISandBoxSV {

	@POST
	@Path("/checkRegistryAvailable")
    boolean checkRegistryAvailable(String registryURL) throws BusinessException,SystemException;

    /**
     * 根据索引ID从搜索引擎读取配置
     * 
     * @param indexId
     * @return
     * @author zhangchao
     * @ApiDocMethod
     */
	@POST
	@Path("/getAPICallSettingFromES")
    APICallSetting getAPICallSettingFromES(String indexId) throws BusinessException,SystemException;

    /**
     * 保存API的设置信息
     * 
     * @param apiData
     * @author zhangchao
     */
	@POST
	@Path("/saveAPICallSetting")
    void saveAPICallSetting(APICallSetting setting) throws BusinessException,SystemException;

    /**
     * 获取这个方法已经保存了的测试用例
     * 
     * @param interfaceName
     * @param method
     * @return
     * @author zhangchao
     */
	@POST
	@Path("/getAPICallCases")
    List<APICallCase> getAPICallCases(String interfaceName, String method) throws BusinessException,SystemException;

    /**
     * 保存新的测试用例
     * 
     * @param callCase
     * @author zhangchao
     */
	@POST
	@Path("/saveAPICallCase")
    void saveAPICallCase(APICallCase callCase) throws BusinessException,SystemException;

    /**
     * 发起DUBBO的MOCK测试
     * 
     * @param callCase
     * @param registryURL
     * @return
     * @author zhangchao
     */
	@POST
	@Path("/excuteTest")
    String excuteTest(APICallCase callCase, String registryURL) throws BusinessException,SystemException;

    /**
     * 保存沙箱设置信息
     * 
     * @param setting
     * @author zhangchao
     */
	@POST
	@Path("/setAPISandboxSetting")
    void setAPISandboxSetting(APICallSetting setting) throws BusinessException,SystemException;

    /**
     * 按照条件查询测试用例
     * 
     * @param query
     * @return
     * @author zhangchao
     */
	@POST
	@Path("/queryAPICallCases")
    PageInfo<APICallCase> queryAPICallCases(APICallCaseQuery query) throws BusinessException,SystemException;

    /**
     * 获取用例参数模板
     * 
     * @param caseId
     * @return
     * @author zhangchao
     */
	@POST
	@Path("/queryAPICallCaseReqParams")
    List<APICallCaseReqParam> queryAPICallCaseReqParams(String caseId) throws BusinessException,SystemException;

    /**
     * 根据索引获取API-REST信息
     * 
     * @param indexId
     * @return
     * @author zhangchao
     * @ApiDocMethod
     */
	@POST
	@Path("/getAPIRest")
    APIRest getAPIRest(String indexId) throws BusinessException,SystemException;

    /**
     * 测试REST服务
     * 
     * @param restTestReq
     * @return
     * @author zhangchao
     * @ApiDocMethod
     */
	@POST
	@Path("/testRest")
    String testRest(APIRestTestReq restTestReq) throws BusinessException,SystemException;

}
