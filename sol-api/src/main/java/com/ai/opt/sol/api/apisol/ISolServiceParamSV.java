package com.ai.opt.sol.api.apisol;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.sol.api.apisol.param.APISolServiceDesignInput;
import com.ai.opt.sol.api.apisol.param.APISolServiceDesignOutput;
import com.ai.opt.sol.api.apisol.param.APISolServiceQueryResult;

@Path("/SOLFun")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface ISolServiceParamSV {
	/**
	 * 定义服务入参接口
    * 
    * @param solServiceDesignInput
    * @return BaseResponse
    * @throws BusinessException
	* @throws SystemException
    * @author biancx
    * @ApiDocMethod
    */
	@POST
	@Path("/designServiceInput")
	BaseResponse createServiceInput(APISolServiceDesignInput solServiceDesignInput) throws BusinessException,SystemException;
	
	/**
	* 定义服务出参接口
    * 
    * @param solServiceDesignOutput
    * @return BaseResponse
    * @throws BusinessException
	* @throws SystemException
    * @author biancx
    * @ApiDocMethod
    */
	@POST
	@Path("/designServiceOutput")
	BaseResponse createServiceOutput(APISolServiceDesignOutput solServiceDesignOutput) throws BusinessException,SystemException;
	
	/**
	* 查询服务信息
	* @param srvApiId
    * @return APISolServiceQueryResult
    * @throws BusinessException
	* @throws SystemException
    * @author biancx
    * @ApiDocMethod
	 */
	@POST
	@Path("/queryService")
	APISolServiceQueryResult designServiceQuery(String srvApiId) throws BusinessException,SystemException;
	/**
	* 修改入参服务信息
	* @param srvApiId
    * @return  List<APISolServiceDesignInput>
    * @throws BusinessException
	* @throws SystemException
    * @author biancx
    * @ApiDocMethod 
	 */
	@POST
	@Path("/modifyInputServiceParam")
	List<APISolServiceDesignInput> modifyInputServiceParam(APISolServiceDesignInput srvApiId) throws BusinessException,SystemException;
	
	/**
	* 修改出参服务信息
	* @param srvApiId
    * @return  List<APISolServiceDesignOutput>
    * @throws BusinessException
	* @throws SystemException
    * @author biancx
    * @ApiDocMethod 
	 */
	@POST
	@Path("/modifyOutputServiceParam")
	List<APISolServiceDesignOutput> modifyOutputServiceParam(APISolServiceDesignOutput srvApiId) throws BusinessException,SystemException;
	/**
	* 删除入参服务信息
	* @param srvApiId
    * @return  List<APISolServiceDesignInput>
    * @throws BusinessException
	* @throws SystemException
    * @author biancx
    * @ApiDocMethod 
	 */
	@POST
	@Path("/delInputServiceParam")
	int delInputServiceParam(APISolServiceDesignInput srvInput) throws BusinessException,SystemException;
	
	/**
	* 删除出参服务信息
	* @param srvApiId
    * @return  List<APISolServiceDesignOutput>
    * @throws BusinessException
	* @throws SystemException
    * @author biancx
    * @ApiDocMethod 
	 */
	@POST
	@Path("/delOutputServiceParam")
	void delOutputServiceParam(APISolServiceDesignOutput srvOutput) throws BusinessException,SystemException;
}



