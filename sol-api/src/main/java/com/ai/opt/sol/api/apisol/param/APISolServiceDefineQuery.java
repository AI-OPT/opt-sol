package com.ai.opt.sol.api.apisol.param;

import java.io.Serializable;

public class APISolServiceDefineQuery implements Serializable{
	private static final long serialVersionUID = 2381019706632060793L;
	/**
	 * 服务id
	 */
	private String srvApiId;
	/**
	 * 服务名称
	 */
	private String srvApiName;
	public String getSrvApiId() {
		return srvApiId;
	}
	public void setSrvApiId(String srvApiId) {
		this.srvApiId = srvApiId;
	}
	public String getSrvApiName() {
		return srvApiName;
	}
	public void setSrvApiName(String srvApiName) {
		this.srvApiName = srvApiName;
	}
}
