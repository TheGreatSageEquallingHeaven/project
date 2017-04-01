package com.politeness.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringWebTest {
	
	@RequestMapping("/test")
	public @ResponseBody String test(){
		return "this message is spring-test";
	}
	
}
