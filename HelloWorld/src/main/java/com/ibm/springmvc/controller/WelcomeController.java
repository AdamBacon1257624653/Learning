package com.ibm.springmvc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class WelcomeController {

	@RequestMapping("/welcome")
	public String WelcomeHandle() {
		System.out.println("Welcome To this Page");
		return "Welcome";
	}

	@RequestMapping("/hello")
	public String HelloHandle(String username) {
		System.out.println("Hello, Welcome! My name is " + username);
		return "Hello";
	}

	@RequestMapping("/hi")
	public String HiHandle(String username, Map<String, Object> context1) {
		System.out.println("Hello, Welcome! My name is " + username);
		context1.put("returnKey", "Copy that");
		return "Hi";
	}

	@RequestMapping("/hei")
	public String HiHandle(String username, Model model) {
		System.out.println("Hello, Welcome! My name is " + username);
		model.addAttribute("returnKey", "Hei, got it");
		model.addAttribute("----" + username + "----");
		return "Hei";
	}

}
