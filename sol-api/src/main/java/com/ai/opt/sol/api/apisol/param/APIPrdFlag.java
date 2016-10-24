package com.ai.opt.sol.api.apisol.param;

import java.io.Serializable;

public class APIPrdFlag implements Serializable{

	private static final long serialVersionUID = 5191594431903075442L;
	/**
	 * 产品线名称
	 */
	private String prdlineName;
	/**
	 * 产品线版本
	 */
	private String prdlineVersion;
	/**
	 * 服务版本
	 */
	private String serviceVersion;
	
	public String getPrdlineName() {
		return prdlineName;
	}
	public void setPrdlineName(String prdlineName) {
		this.prdlineName = prdlineName;
	}
	public String getPrdlineVersion() {
		return prdlineVersion;
	}
	public void setPrdlineVersion(String prdlineVersion) {
		this.prdlineVersion = prdlineVersion;
	}
	public String getServiceVersion() {
		return serviceVersion;
	}
	public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
	}
	

}
