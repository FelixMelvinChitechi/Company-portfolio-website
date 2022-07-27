package net.codejava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	
@GetMapping("/")
public String getHome() {
	return "index";
}
@GetMapping("/about")
public String showAbout() {
	return "about";
}

@GetMapping("/team")
public String showTeam() {
	return "team";
}

@GetMapping("/service")
public String showService() {
	return "service";
}
@GetMapping("/contact")
public String showContact() {
	return "contact";
}
@GetMapping("/client")
public String showClient() {
	return "client";
}
}
