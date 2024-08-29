package Springmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String Home() {
		return "index";
	}
	
	@RequestMapping("/Register")
	public String Register() {
		return "Register";
	}
	
	@RequestMapping(path="/Process", method=RequestMethod.POST)
	public ModelAndView HandleFormData(
			@RequestParam("username") String UserName,
			@RequestParam("email") String Email,
			@RequestParam("mobile") String Mobile,
			@RequestParam("gender") String Gender,
			@RequestParam("address") String Address,
			@RequestParam("password") String Password,
			@RequestParam("confirmpassword") String ConfirmPassword
			) {
		System.out.println(UserName);
		System.out.println(Email);
		System.out.println(Mobile);
		System.out.println(Gender);
		System.out.println(Address);
		System.out.println(Password);
		System.out.println(ConfirmPassword);
		
		ModelAndView modelandview = new ModelAndView();
		modelandview.addObject("username", UserName);
		modelandview.addObject("email", Email);
		modelandview.addObject("mobile", Mobile);
		modelandview.addObject("gender", Gender);
		modelandview.addObject("address", Address);
		modelandview.addObject("password", Password);
		modelandview.addObject("confirmpassword", ConfirmPassword);
		modelandview.setViewName("Done");
		
		return modelandview;
	}
	

}
