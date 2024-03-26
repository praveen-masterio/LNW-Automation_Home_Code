package com.mvc2.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("assign1")
public class AssignController1 {
	
	@RequestMapping("/index")
	public String getIndex() {
		return "index" ;
	}
	
	@RequestMapping("/welcome")
	public String displayWelcome() {
		return "welcome";
	}
}

