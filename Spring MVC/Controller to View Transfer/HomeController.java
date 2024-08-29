package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name", "Swapnali");
		model.addAttribute("ID", 123);
		List<String> Friend = new ArrayList<String>();
		Friend.add("Raj");
		Friend.add("Dhanashree");
		Friend.add("Aabha");
		model.addAttribute("Friend", Friend);
		return "index";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help controller");
		
		//Creating modelandview object
		ModelAndView modelandview = new ModelAndView();
		
		//Adding Data
		modelandview.addObject("name", "Swapnali");
		modelandview.addObject("ID", 890);
		List<Integer> Marks = new ArrayList<Integer>();
		Marks.add(12);
		Marks.add(15);
		Marks.add(18);
		modelandview.addObject("Marks", Marks);
		
		//Setting View
		modelandview.setViewName("help");
		return modelandview;
	}

}
