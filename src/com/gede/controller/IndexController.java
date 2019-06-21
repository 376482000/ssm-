package com.gede.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author gede
* @version date：2019年6月20日 下午10:18:20
* @description ：
*/
@Controller
public class IndexController {
	@RequestMapping(value="/",method=GET)
	public String index(){
		return "index";
	}
}

