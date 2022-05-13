package com.example.demo.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mvc")
public class WelcomeController {
@RequestMapping(value = "/greet" ,method = RequestMethod.GET)
@ResponseBody
	public String getMessage() {
		
		return " <h1 style = 'text-align:center'>Welcome To Spring MVC</h1>";
		
	}
	
@ResponseBody
public String getMessage1() {
	
	return " <h1 style = 'text-align:center'>designed by mama</h1>";
	
}
}
