package com.libiri.ontaro.controllers;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller {

	ArrayList<String> people = new ArrayList<String>();
	@GetMapping("/")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("name2", "dfdsfd");
        people.add("hello.html");
        people.add("home.html");
		return people.get(0);
	}

	@RequestMapping("/hello")
	public ModelAndView index () {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.getModel().put("name", "Spring Security Example");
		modelAndView.setViewName("home.html");
		return modelAndView;
	}
	

}