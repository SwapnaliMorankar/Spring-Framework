package Springmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Main")
public class MainController {
	
	@RequestMapping("/")
	public String None() {
		return "None";
	}
	
	@RequestMapping("/Home")
	public String Home() {
		return "index";
	}

	@RequestMapping("/About")
	public String About() {
		return "About";
	}
	
	@RequestMapping("/Register")
	public String Register() {
		return "Register";
	}
	
	@RequestMapping("/Support")
	public String Support() {
		return "Support";
	}
}
