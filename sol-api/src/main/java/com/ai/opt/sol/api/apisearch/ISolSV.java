package com.ai.opt.sol.api.apisearch;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.sol.api.apisearch.param.APISolPrdline;
import com.ai.opt.sol.api.apisearch.param.APISolServiceDefine;
import com.ai.opt.sol.api.apisearch.param.APISolServiceDesignInput;
import com.ai.opt.sol.api.apisearch.param.APISolServiceDesignOutput;

@Path("/SOLFun")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface ISolSV {
    /**
     * 新建产品线接口
     * 
     * @param solPrdline
     * @return BaseResponse
     * @throws BusinessException
	 * @throws SystemException
     * @author biancx
     * @ApiDocMethod
     */
	@POST
	@Path("/createSolPrdline")
	BaseResponse createSolPrdline(APISolPrdline solPrdline) throws BusinessException,SystemException;
	
	/**
	 * 定义服务接口
     * 
     * @param solServiceDefine
     * @return BaseResponse
     * @throws BusinessException
	 * @throws SystemException
     * @author biancx
     * @ApiDocMethod
     */
	@POST
	@Path("/createSolService")
	BaseResponse createSolService(APISolServiceDefine solServiceDefine) throws BusinessException,SystemException;
	
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
	
}
