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
	/**
	 * 产品线编码
	 */
	private String prdlineCode;
	/**
	 * 负责人
	 */
	private String prdlineManager;
	/**
	 * 标签id
	 */
	private String srvPrdlineId;
	/**
	 * 产品线版本id
	 */
	private String prdlineVersionId;
	/**
	 * 服务版本id
	 */
	private String srvVersionId;
	
	
	public String getSrvPrdlineId() {
		return srvPrdlineId;
	}
	public void setSrvPrdlineId(String srvPrdlineId) {
		this.srvPrdlineId = srvPrdlineId;
	}
	public String getPrdlineVersionId() {
		return prdlineVersionId;
	}
	public void setPrdlineVersionId(String prdlineVersionId) {
		this.prdlineVersionId = prdlineVersionId;
	}
	public String getSrvVersionId() {
		return srvVersionId;
	}
	public void setSrvVersionId(String srvVersionId) {
		this.srvVersionId = srvVersionId;
	}
	public String getPrdlineCode() {
		return prdlineCode;
	}
	public void setPrdlineCode(String prdlineCode) {
		this.prdlineCode = prdlineCode;
	}
	public String getPrdlineManager() {
		return prdlineManager;
	}
	public void setPrdlineManager(String prdlineManager) {
		this.prdlineManager = prdlineManager;
	}
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
