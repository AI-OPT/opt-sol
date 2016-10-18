package com.ai.opt.sol.api.apisol;

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
	BaseResponse designServiceInput(APISolServiceDesignInput solServiceDesignInput) throws BusinessException,SystemException;
	
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
	BaseResponse designServiceOutput(APISolServiceDesignOutput solServiceDesignOutput) throws BusinessException,SystemException;
	
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
}
