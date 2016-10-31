package com.ai.opt.sol.api.apisol.param;

import java.io.Serializable;
import java.util.List;

public class APISolServiceQueryResult implements Serializable{

	private static final long serialVersionUID = 137408140360425145L;
	/**
	 * 服务定义信息
	 */
	private APISolServiceDefine serviceDefine;
	/**
	 * 服务入参信息
	 */
	private List<APISolServiceDesignInput> serviceDesignInput;
	/**
	 * 服务出参信息
	 */
	private List<APISolServiceDesignOutput> serviceDesignOutput;
	
	public APISolServiceDefine getServiceDefine() {
		return serviceDefine;
	}
	public void setServiceDefine(APISolServiceDefine serviceDefine) {
		this.serviceDefine = serviceDefine;
	}
	public List<APISolServiceDesignInput> getServiceDesignInput() {
		return serviceDesignInput;
	}
	public void setServiceDesignInput(List<APISolServiceDesignInput> serviceDesignInput) {
		this.serviceDesignInput = serviceDesignInput;
	}
	public List<APISolServiceDesignOutput> getServiceDesignOutput() {
		return serviceDesignOutput;
	}
	public void setServiceDesignOutput(List<APISolServiceDesignOutput> serviceDesignOutput) {
		this.serviceDesignOutput = serviceDesignOutput;
	}
	
	
}
