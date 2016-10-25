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
import com.ai.opt.sol.api.apisol.param.APISolPrdline;
import com.ai.opt.sol.api.apisol.param.APISolServiceVersion;

@Path("/SOLFun")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface ISolServiceVersionSV {
	/**
     * 新建服务版本  
     * 
     * @param APISolServiceVersion
     * @return BaseResponse
     * @throws BusinessException
	 * @throws SystemException
     * @author biancx
     * @ApiDocMethod
     */
	@POST
	@Path("/createSolServiceVersion")
	BaseResponse createSolServiceVersion(APISolServiceVersion solSrvVersion) throws BusinessException,SystemException;
	/**
	 * 打版本和版本记录
     * @param srvApiId
     * @return List<APISolServiceVersion>
     * @throws BusinessException
	 * @throws SystemException
     * @author biancx
     * @ApiDocMethod
	 */
	@POST
	@Path("/querySolServiceVersion")
	List<APISolServiceVersion> querySolServiceVersion(String srvApiId)throws BusinessException,SystemException;
}
