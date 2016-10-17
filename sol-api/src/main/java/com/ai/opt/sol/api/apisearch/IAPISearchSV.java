package com.ai.opt.sol.api.apisearch;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.sol.api.apisearch.param.APIEnvSettings;
import com.ai.opt.sol.api.apisearch.param.APIOwnerType;
import com.ai.opt.sol.api.apisearch.param.APISearchKey;
import com.ai.opt.sol.api.apisearch.param.APISearchResult;

@Path("/APISearch")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IAPISearchSV {

    /**
     * 获取在线网站API的信息
     * 
     * @return
     * @author zhangchao
     * @ApiDocMethod
     */
	@POST
	@Path("/getAPIStatistics")
    String getAPIStatistics() throws BusinessException,SystemException;

    /**
     * 获取所有服务的归属类型列表
     * 
     * @return
     * @author zhangchao
     * @ApiDocMethod
     */
	@POST
	@Path("/getAPIOwnerTypes")
    List<APIOwnerType> getAPIOwnerTypes() throws BusinessException,SystemException;

    /**
     * 服务API综合查询
     * 
     * @param searchKey
     * @return
     * @author zhangchao
     * @ApiDocMethod
     */
	@POST
	@Path("/searchAPIDocs")
    PageInfo<APISearchResult> searchAPIDocs(APISearchKey searchKey) throws BusinessException,SystemException;

    /**
     * 获取服务版本历史
     * 
     * @param apiDetailIndexId
     * @return
     * @author zhangchao
     * @ApiDocMethod
     */
	@POST
	@Path("/getAPIVersionHistory")
    String getAPIVersionHistory(String apiDetailIndexId) throws BusinessException,SystemException;
	@POST
	@Path("/getAPIVersionNew")
    String getAPIVersionNew(String apiDetailIndexId) throws BusinessException,SystemException;

    /**
     * 根据参数类索引ID获取API参数类的属性列表
     * 
     * @param fieldIndexId
     * @return
     * @author zhangchao
     * @ApiDocMethod
     */
	@POST
	@Path("/getAPIClassDetail")
    String getAPIClassDetail(String apiParamIndexId) throws BusinessException,SystemException;

    /**
     * 根据索引删除API信息
     * 
     * @param indexId
     * @throws CallerException
     * @author zhangchao
     * @ApiDocMethod
     */
	@POST
	@Path("/deleteAPINew")
    void deleteAPINew(String indexId) throws BusinessException,SystemException;

    /**
     * 下载某提供者的API数据
     * 
     * @param ownerType
     * @param owner
     * @return
     * @throws CallerException
     * @author zhangchao
     * @ApiDocMethod
     */
	@POST
	@Path("/downloadAPIs")
    String downloadAPIs(String ownerType, String owner) throws BusinessException,SystemException;

    /**
     * 下载单个接口的数据
     * 
     * @param ownerType
     * @param owner
     * @param artifactId
     * @param interfaceName
     * @param method
     * @return
     * @throws CallerException
     * @author zhangchao
     * @ApiDocMethod
     */
	@POST
	@Path("/downloadAPI")
    String downloadAPI(String ownerType, String owner, String artifactId, String interfaceName,
            String method) throws BusinessException,SystemException;

    /**
     * 保存API调用者设置
     * 
     * @param envSettings
     * @throws CallerException
     * @author zhangchao
     * @ApiDocMethod
     */
	@POST
	@Path("/saveAPIEnvSettings")
    void saveAPIEnvSettings(APIEnvSettings envSettings) throws BusinessException,SystemException;

    /**
     * 获取指定的服务提供者的环境设置
     * 
     * @param ownerType
     * @param owner
     * @return
     * @throws Exception
     * @author zhangchao
     * @ApiDocMethod
     */
	@POST
	@Path("/getAPIEnvSettings")
    List<APIEnvSettings> getAPIEnvSettings(String ownerType, String owner) throws BusinessException,SystemException;

    /**
     * 获取单个环境设置信息
     * 
     * @param settingId
     * @return
     * @throws CallerException
     * @author zhangchao
     * @ApiDocMethod
     */
	@POST
	@Path("/getAPIEnvSetting")
    APIEnvSettings getAPIEnvSetting(String settingId) throws BusinessException,SystemException;

    /**
     * 获取所有服务提供者环境设置列表
     * 
     * @return
     * @throws CallerException
     * @author zhangchao
     * @ApiDocMethod
     */
	@POST
	@Path("/getAllAPIEnvSettings")
    List<APIEnvSettings> getAllAPIEnvSettings() throws BusinessException,SystemException;

}
