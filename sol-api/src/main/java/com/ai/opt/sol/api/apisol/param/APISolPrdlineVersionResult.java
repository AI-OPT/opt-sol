package com.ai.opt.sol.api.apisol.param;

import java.io.Serializable;

public class APISolPrdlineVersionResult implements Serializable{

	private static final long serialVersionUID = 6950099056384373801L;
	/**
	 * 产品线名称
	 */
	private String prdlineName;
	/**
	 * 产品线版本
	 */
	private String prdlineVersion;
	/**
	 * 产品线版本创建时间
	 */
	private String createTime;
	
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
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	
	

}
