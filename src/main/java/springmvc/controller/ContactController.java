package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springmvc.model.User;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}
	
	@RequestMapping(path="/processRequest",method=RequestMethod.POST)
	public String process(@ModelAttribute User user, Model model) {
		return "success";
	}
	
	
	@RequestMapping("/one")
	public String one() {
		System.out.println("One called");
		return "redirect:/two";
	}
	
	@RequestMapping("/two")
	public String two() {
		System.out.println("Two called");
		return "redirect:/contact";
	}
}
