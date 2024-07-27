package com.example.bootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.bootdemo.model.User;

@Controller
public class MainController {
	@RequestMapping("")
	public String home(Model model) {
		model.addAttribute("user",new User());
		return "home";
	}
	
	@RequestMapping("send")
	public String send(@ModelAttribute("user")User user,Model model) {
		model.addAttribute("userdata",user);
		return "profile";
	}

}
