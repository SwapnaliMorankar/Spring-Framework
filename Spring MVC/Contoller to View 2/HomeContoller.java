package springmvc.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeContoller {
	
	@RequestMapping("/home")
	public String Home() {
		return "index";
	}
	
	@RequestMapping("/about")
	public String About(Model model) {
		model.addAttribute("name1", "Swapna");
		model.addAttribute("name2", "Raj");
		model.addAttribute("ID", 111);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Avinash");
		friends.add("Harshal");
		friends.add("Umakant");
		
		model.addAttribute("friendlist", friends);
		
		return "About";
	}
	
	@RequestMapping("/help")
	public ModelAndView Help() {
		ModelAndView modelandview = new ModelAndView();
		modelandview.addObject("name", "Swapnali");
		modelandview.addObject("ID", 111);
		modelandview.addObject("City", "Pune");
		List<Integer> Marks = new ArrayList<Integer>();
		Marks.add(34);
		Marks.add(48);
		Marks.add(49);
		Marks.add(37);
		modelandview.addObject("marks", Marks);
		modelandview.setViewName("Help");
		return modelandview;
	}
	

}
