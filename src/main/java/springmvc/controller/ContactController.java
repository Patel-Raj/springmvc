package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}
	
	@RequestMapping(path="/processRequest",method=RequestMethod.POST)
	public ModelAndView process(@RequestParam("name") String name, @RequestParam("pass") String pass) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", name);
		modelAndView.addObject("pass", pass);
		modelAndView.setViewName("success");
		return modelAndView;
	}
}
