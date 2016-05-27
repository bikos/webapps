package com.jspwebapps.controllers;

import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Jspworld {

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String helloWorld(Locale locale, String username, String password ) {
		return "welcome";
	}

	@RequestMapping("/message")
	public String newMessage(Model model) {
		Date date = new Date();
		model.addAttribute("time", date.toString());
		model.addAttribute("depName", DatabaseConnections.returnDepartmentName());
		return "message";
	}

	@RequestMapping("/advanced")
	public String advancedPage() {
		return "advanced";
	}

	@RequestMapping("/form")
	public String formPage() {
		return "form";
	}
	
	@RequestMapping("/home")
	public String homePage() {
		return "home";
	}
	
	@RequestMapping("/validation")
	public String homeValidation() {
		return "validation";
	}
	
	@RequestMapping(value="/greeting")
		public String sayhello(Model model){
			model.addAttribute("greeting", "ollapeople");
		
		
		return "home";
	}
	
//	@RequestMapping(value="/javaTest/")
//	@ResponseBody
//	public String method9(@RequestParam("testVar") String str){
//		System.out.println(str);
//		return "method9 with id= "+str;
//	}

}
