package com.nks.springbootopenshift;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/site")
public class indexController {

	@GetMapping("/")
	public String index(Model model) {

		model.addAttribute("name", "neeraj kumar sharma");

		return "index";
	}

	@GetMapping("/about")
	public String about(Model model) {

		model.addAttribute("name", "neeraj kumar sharma");

		return "about";
	}
}
