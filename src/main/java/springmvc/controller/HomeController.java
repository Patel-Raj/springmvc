package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.Servlet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		List<String> friends = new ArrayList<String>();
		friends.add("Rachit");
		friends.add("Rohit");
		
		model.addAttribute("name", "Raj");
		model.addAttribute("friends", friends);
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		return "about";
	}

}
