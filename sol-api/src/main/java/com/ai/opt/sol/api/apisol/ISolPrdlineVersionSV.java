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
import com.ai.opt.sol.api.apisol.param.APISolPrdlineVersion;
import com.ai.opt.sol.api.apisol.param.APISolPrdlineVersionResult;

@Path("/SOLFun")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface ISolPrdlineVersionSV {
	
	 /**
     * 新建产品线版本
     * 
     * @param APISolPrdlineVersion
     * @return BaseResponse
     * @throws BusinessException
	 * @throws SystemException
     * @author biancx
     * @ApiDocMethod
     */
	@POST
	@Path("/createSolPrdlineVersion")
	BaseResponse createSolPrdlineVersion(APISolPrdlineVersion solPrdlineVersion) throws BusinessException,SystemException;
	
	/**
	 * 修改产品线版本
	 * @param APISolPrdlineVersion
     * @return int 修改产品线的个数
     * @throws BusinessException
	 * @throws SystemException
     * @author biancx
     * @ApiDocMethod
	 */
	@POST
	@Path("/modifySolPrdlineVersion")
	int modifySolPrdlineVersion(APISolPrdlineVersion solPrdlineVersion) throws BusinessException,SystemException;
	
	/**
	 * 查询产品线版本信息
	 * @param APISolPrdline
     * @return List<APISolPrdlineVersionResult>
     * @throws BusinessException
	 * @throws SystemException
     * @author biancx
     * @ApiDocMethod
	 */
	@POST
	@Path("/querySolPrdlineVersion")
	List<APISolPrdlineVersionResult> querySolPrdlineVersion(APISolPrdline apiSolPrdline) throws BusinessException,SystemException;
	
	/**
	 * 查询产品线版本信息
	 * @param APISolPrdline
     * @return List<APISolPrdlineVersionResult>
     * @throws BusinessException
	 * @throws SystemException
     * @author biancx
     * @ApiDocMethod
	 */
	@POST
	@Path("/querySolPrdlineVersionId")
	List<APISolPrdlineVersion> querySolPrdlineVersionId(String prdlineId) throws BusinessException,SystemException;
	
}
