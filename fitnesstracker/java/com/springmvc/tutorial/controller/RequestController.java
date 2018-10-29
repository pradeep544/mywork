package com.springmvc.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestController {
	
	@RequestMapping(value = "/greeting")
	public String sayHello(Model model) {
		model.addAttribute("name", "Hello Pradeep");
		return "hello";
	}
}
