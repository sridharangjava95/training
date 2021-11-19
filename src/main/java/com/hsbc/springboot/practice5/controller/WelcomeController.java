package com.hsbc.springboot.practice5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	@RequestMapping("/welcome")
	public ModelAndView getwelcomepage() {
		ModelAndView mav = new ModelAndView("welcome");
		return mav;
	}
}
