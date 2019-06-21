package com.gede.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gede.model.Webuser;
import com.gede.service.GetUserService;

/**
* @author gede
* @version date：2019年6月20日 下午10:57:46
* @description ：
*/
@Controller
public class SelectController {
	private GetUserService getUserService;
	
	@Autowired
	public SelectController(GetUserService getUserService) {
		super();
		this.getUserService = getUserService;
	}
	@RequestMapping(value="/select",method=GET)
	public String index(Model model){
		Webuser user=getUserService.select();
		model.addAttribute("user", user);
		return "user";
	}
}
