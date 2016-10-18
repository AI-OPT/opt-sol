package com.ai.opt.sol.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.sol.api.apisol.param.APISolServiceDesignInput;
import com.ai.opt.sol.business.interfaces.ISolServiceDesignInputBuessiness;
import com.ai.opt.sol.dao.mapper.bo.SolServiceDesignInput;
import com.ai.opt.sol.dao.mapper.interfaces.SolServiceDesignInputMapper;
@Service
@Transactional()
public class ISolServiceDesignInputBussinessImpl implements ISolServiceDesignInputBuessiness{
	@Autowired
	SolServiceDesignInputMapper solServiceDesignInputMapper;
	@Override
	public void insertServiceInput(APISolServiceDesignInput solServiceInput) {
		SolServiceDesignInput serviceInput=new SolServiceDesignInput();
		serviceInput.setInputId(solServiceInput.getInputId());
		serviceInput.setInputName(solServiceInput.getInputName());
		serviceInput.setIsrequired(solServiceInput.getIsRequired());
		serviceInput.setParentInputName(solServiceInput.getParentInputName());
		serviceInput.setSrvApiId(solServiceInput.getSrvApiId());
		solServiceDesignInputMapper.insert(serviceInput);
	}

}
