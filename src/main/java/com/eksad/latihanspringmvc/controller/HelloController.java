package com.eksad.latihanspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	@ResponseBody
		public String sayHello() {
			return "Hello World";
		}
	
	@RequestMapping("/Name")
	@ResponseBody
		public String myName(@RequestParam String myName) {
			return "Hello "+myName;
		}
	
	@RequestMapping("/namasaya/{Name}")
	@ResponseBody
		public String namasaya(@PathVariable String Name) {
			return "Hello "+Name;
		}
	
	@RequestMapping("/toWEB")
	@ResponseBody
		public String toGoogle() {
			return "<a href='http://www.google.com' target='_blank'> Google </a>"
					+"</br> <a href='http://www.youtube.com' target='_blank'> Youtube </a>";
		}
	
	
				
}
