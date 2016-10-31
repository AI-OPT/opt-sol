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
import com.ai.opt.sol.api.apisol.param.APISolServiceDefine;
import com.ai.opt.sol.api.apisol.param.APISolServiceDefineQuery;
import com.ai.opt.sol.api.apisol.param.APISrvQueryCount;

@Path("/SOLFun")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface ISolServiceDefineSV {
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
	 * 根据服务名称、服务编码、所属中心、所属分类查询
     * 
     * @param solServiceDefine
     * @return List<APISolServiceDefine>
     * @throws BusinessException
	 * @throws SystemException
     * @author biancx
     * @ApiDocMethod
     */
	@POST
	@Path("/querySolService")
	List<APISrvQueryCount> querySolService(APISolServiceDefine solServiceDefineQuery) throws BusinessException,SystemException;
	
	/**
	 * 根据服务名称、服务编码、所属中心、所属分类查询
     * 
     * @param solServiceDefine
     * @return List<APISolServiceDefine>
     * @throws BusinessException
	 * @throws SystemException
     * @author biancx
     * @ApiDocMethod
     */
	@POST
	@Path("/modifySolService")
	int modifySolService(APISolServiceDefine solServiceDefineQuery) throws BusinessException,SystemException;
	
}
