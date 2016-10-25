package com.ai.opt.sol.api.apisol.param;

import java.io.Serializable;
import java.util.List;

public class APISrvQueryCount implements Serializable{

	private static final long serialVersionUID = -1399098581177214383L;
	/**
	 * 服务编码
	 */
	private String srvApiId;
	/**
	 * 服务名称
	 */
	private String srvApiName;
	/**
	 * 服务分类
	 */
	private List<String> srvCategory;
	/**
	 * 产品标签数量
	 */
	private String prdFlagCount;
	/**
	 * 服务版本记录数量
	 */
	private String srvVersionCount;
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
	public List<String> getSrvCategory() {
		return srvCategory;
	}
	public void setSrvCategory(List<String> srvCategory) {
		this.srvCategory = srvCategory;
	}
	public String getPrdFlagCount() {
		return prdFlagCount;
	}
	public void setPrdFlagCount(String prdFlagCount) {
		this.prdFlagCount = prdFlagCount;
	}
	public String getSrvVersionCount() {
		return srvVersionCount;
	}
	public void setSrvVersionCount(String srvVersionCount) {
		this.srvVersionCount = srvVersionCount;
	}
	
	

}
