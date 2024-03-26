package com.mvc2.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mvc2.model.Customer;

@Controller
@RequestMapping("assign2")
public class AssignController2 {
	
	@RequestMapping("/index")
	public String getIndex() {
		return "index" ;
	}
	
	@RequestMapping("/register")
	public ModelAndView getRegister(ModelAndView mav,@ModelAttribute("customer") Customer customer) {
		mav.addObject(customer) ;
		mav.setViewName("register") ;
		return mav ;
	}
	
	@RequestMapping("/customer")
	public ModelAndView getCustomer(ModelAndView mav,@Valid @ModelAttribute("customer") Customer customer, Errors er) {
		if(er.hasErrors() ) {
			mav.setViewName("register") ;
		} else {
			mav.setViewName("customer") ;
		}
		return mav ;
	}
	
}
