package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

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
	public RedirectView one() {
		System.out.println("One called");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("two");
		return redirectView;
	}
	
	@RequestMapping("/two")
	public String two() {
		System.out.println("Two called");
		return "redirect:/contact";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("text") String text) {
		System.out.println(text);
		String googleUrl = "https://www.google.com/search?q=" + text.replace(' ', '+');
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(googleUrl);
		return redirectView;
	}
}
