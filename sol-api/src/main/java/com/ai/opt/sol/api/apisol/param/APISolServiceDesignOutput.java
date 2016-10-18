package com.ai.opt.sol.api.apisol.param;

import java.io.Serializable;

public class APISolServiceDesignOutput implements Serializable{

	private static final long serialVersionUID = 8214981019944321537L;
	/**
	 * 服务ID
	 */
	private String srvApiId;
	/**
	 * 出参ID
	 */
	private String outputId;
	/**
	 * 出参名称
	 */
	private String outputName;
	/**
	 * 父级参数名称
	 */
	private String parentOutputName;
	public String getSrvApiId() {
		return srvApiId;
	}
	public void setSrvApiId(String srvApiId) {
		this.srvApiId = srvApiId;
	}
	public String getOutputId() {
		return outputId;
	}
	public void setOutputId(String outputId) {
		this.outputId = outputId;
	}
	public String getOutputName() {
		return outputName;
	}
	public void setOutputName(String outputName) {
		this.outputName = outputName;
	}
	public String getParentOutputName() {
		return parentOutputName;
	}
	public void setParentOutputName(String parentOutputName) {
		this.parentOutputName = parentOutputName;
	}
	

}
