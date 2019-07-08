package com.eksad.latihanspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/my")
public class MyController {
	
	@RequestMapping("Ola")
	public String Hai() {
		return "hello";
	}
	
	@RequestMapping("nama")
	public String myName(@RequestParam String name, Model model ) {
		
		model.addAttribute("name", name);
		
		return "myname";
	}
	
}
