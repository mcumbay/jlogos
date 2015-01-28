package com.dfwcomputech.jlogos.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
	private Logger log = LoggerFactory.getLogger(getClass());

	@RequestMapping(value = "/")
	@ResponseBody
	public String showIndex() {
		log.debug("showIndex");
		return "Hello MVC Index";
	}

	@RequestMapping(value="/admin/**")
	@ResponseBody
	public String showAdminPage(){
		log.debug("Only for Admins");
		return "Hello Admin!!!";
	}
}
