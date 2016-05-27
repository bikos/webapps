package com.jspwebapps.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringController {

	@RequestMapping(value = "/javaTest/")
	@ResponseBody
	public String parseURL(@RequestParam("testVar") String str) {
		str = str.replaceAll("\\s+", "").toLowerCase();
		System.out.println(str);
		return str;
	}

}
