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
import com.ai.opt.sol.api.apisol.param.APISolPrdlineQuery;
import com.ai.opt.sol.api.apisol.param.APISolServiceDefine;
import com.ai.opt.sol.api.apisol.param.APISolServiceDesignInput;
import com.ai.opt.sol.api.apisol.param.APISolServiceDesignOutput;
import com.ai.opt.sol.api.apisol.param.APISolSrvPrdline;

@Path("/SOLFun")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface ISolPrdlineSV {
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
	 * 根据产品线名称或产品线编码查询
	 * @param APISolPrdlineQuery
     * @return APISolPrdline
     * @throws BusinessException
	 * @throws SystemException
     * @author biancx
     * @ApiDocMethod
	 */
	@POST
	@Path("/querySolPrdlineNameCode")
	List<APISolPrdline> querySolPrdlineNameCode(APISolPrdlineQuery solPrdlineQuery) throws BusinessException,SystemException;
	
	/**
	 * 根据产品线id查询
	 * @param APISolSrvPrdline
     * @return APISolPrdline
     * @throws BusinessException
	 * @throws SystemException
     * @author biancx
     * @ApiDocMethod
	 */
	@POST
	@Path("/querySolPrdlineId")
	List<APISolPrdline> querySolPrdlineId(String PrdlineId) throws BusinessException,SystemException;
	/**
	 * 修改产品线服务
	 * @param prdlineId 产品线id
     * @return int 修改产品线的个数
     * @throws BusinessException
	 * @throws SystemException
     * @author biancx
     * @ApiDocMethod
	 */
	@POST
	@Path("/modifySolPrdline")
	int modifySolPrdline(APISolPrdline Prdline) throws BusinessException,SystemException;
	
	/**
	 * 修改产品线服务
	 * @param prdlineId 产品线id
     * @return int 修改产品线的个数
     * @throws BusinessException
	 * @throws SystemException
     * @author biancx
     * @ApiDocMethod
	 */
	@POST
	@Path("/delSolPrdline")
	int delSolPrdline(APISolPrdline Prdline) throws BusinessException,SystemException;
}
