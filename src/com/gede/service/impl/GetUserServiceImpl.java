package com.gede.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gede.dao.WebuserMapper;
import com.gede.model.Webuser;
import com.gede.service.GetUserService;

/**
* @author gede
* @version date：2019年6月20日 下午10:54:29
* @description ：
*/
@Component
public class GetUserServiceImpl implements GetUserService {

	private  WebuserMapper webuserMapper;
	
	@Autowired
	public GetUserServiceImpl(WebuserMapper webuserMapper) {
		super();
		this.webuserMapper = webuserMapper;
	}
	@Override
	public Webuser select() {
		Webuser webuser=webuserMapper.selectByPrimaryKey(1);
		return webuser;
	}

}
