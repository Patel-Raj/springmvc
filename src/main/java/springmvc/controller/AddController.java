package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

	@RequestMapping("/add")
	public String add() {
		return "result";
	}
	
	@RequestMapping("/about")
	public ModelAndView aboutPage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("about");
		modelAndView.addObject("name", "Raj Patel");
		List<String> friends = new ArrayList<String>();
		friends.add("Parth");
		friends.add("Urvish");
		modelAndView.addObject("friends", friends);
		return modelAndView;
	}
}
