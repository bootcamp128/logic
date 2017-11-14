package com.xsis.web128.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/main")
public class MainController {

	@ResponseBody
	@RequestMapping
	public String index(){
		return "hello world spring controller";
	}
	
	@RequestMapping(value="/about", method=RequestMethod.GET)
	@ResponseBody
	public String aboutPage(){
		return "about page";
	}
	
	@RequestMapping(value="/form", method=RequestMethod.GET)
	public String formPage(){
		return "form";
	}
}
