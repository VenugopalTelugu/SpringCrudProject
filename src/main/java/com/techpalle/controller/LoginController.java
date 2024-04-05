package com.techpalle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping("login")
	public ModelAndView doLogin(String tbName, String pass) { 
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("user", tbName);
		mv.addObject("pass", pass);
		
		mv.setViewName("display.jsp");
		return mv;
		
	}
}
