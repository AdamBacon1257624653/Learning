package com.ibm.springmvc.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.context.support.StaticApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ibm.springmvc.model.User;

@Controller
@RequestMapping("/Users")
public class UserController {
	private Map<String, User> userMap = new HashMap<>();

	public UserController() {
		userMap.put("01", new User("01", "Peter", 12,"Peter@123.com"));
		userMap.put("02", new User("02", "Tom", 13,"Tom@123.com"));
		userMap.put("03", new User("03", "Juliet", 14,"Juliet@123.com"));
		userMap.put("04", new User("04", "Will", 21,"Will@123.com"));
		userMap.put("05", new User("05", "Jack", 25,"Jack@123.com"));
	}

	@RequestMapping(method = RequestMethod.GET)
	public String getUsers(Model model) {
		model.addAttribute("users", userMap.values());
		return "user/list";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add(@ModelAttribute("user")User user) {
//		model.addAttribute("user", new User());//Alternative
		return "user/add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(@Validated User user,BindingResult br) {
		if(br.hasErrors()){
			return "user/add";
		}
		userMap.put("06", user);
		return "redirect:/Users";
	}
}
