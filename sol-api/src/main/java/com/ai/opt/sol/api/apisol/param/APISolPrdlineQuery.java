package com.ai.opt.sol.api.apisol.param;

import java.io.Serializable;

public class APISolPrdlineQuery implements Serializable{

	private static final long serialVersionUID = -2902555625898671215L;
	/**
     * 产品线名称
     */
	private String prdlineName;
	/**
	 * 产品线编码
	 */
	private String prdlineCode;
	public String getPrdlineName() {
		return prdlineName;
	}
	public void setPrdlineName(String prdlineName) {
		this.prdlineName = prdlineName;
	}
	public String getPrdlineCode() {
		return prdlineCode;
	}
	public void setPrdlineCode(String prdlineCode) {
		this.prdlineCode = prdlineCode;
	}

}
