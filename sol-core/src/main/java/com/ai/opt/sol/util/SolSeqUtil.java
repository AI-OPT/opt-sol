package com.ai.opt.sol.util;


import com.ai.opt.sdk.components.sequence.util.SeqUtil;
import com.ai.opt.sol.constants.SolConstants.SEQ;

public final class SolSeqUtil {
	private SolSeqUtil(){}
	/**
	 * 获取产品线的id
	 * @return
	 */
	public static String getPrdlineId(){
		return SeqUtil.getNewId(SEQ.SOL_PRDLINE_ID_SEQ,1);

	}
	/**
	 * 获取定义服务的id
	 */
	public static String getServiceId(){
		return SeqUtil.getNewId(SEQ.SOL_SERVICE_DEFINE_ID_SEQ, 10);
	}
	/**
	 * 获取定义服务入参的id
	 */
	public static String getServiceInputId(){
		return SeqUtil.getNewId(SEQ.SOL_SERVICE_INPUT_ID_SEQ, 10);
	}
	/**
	 * 获取定义服务出参的id
	 */
	public static String getServiceOutputId(){
		return SeqUtil.getNewId(SEQ.SOL_SERVICE_OUTPUT_ID_SEQ, 10);
	}
	/**
	 * 获取服务产品标签id
	 */
	public static String getSrvPrdlineId(){
		return SeqUtil.getNewId(SEQ.SOL_SERVICE_PRDLINE_ID_SEQ, 10);
	}
	/**
	 * 产品线版本id
	 */
	public static String getPrdlineVersionId(){
		return SeqUtil.getNewId(SEQ.SOL_PRDLINE_VERSION_ID_SEQ, 10);
	}
}
