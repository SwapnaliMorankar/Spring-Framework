package SpringMvc.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
	
	@RequestMapping("")
	public String Home(){
		return "index";
	}
	
	@RequestMapping("/Contact")
	public String Contact(){
		return "Contact";
	}
	
	@RequestMapping("/Register")
	public String Register(){
		return "Register";
	}
	
	//Using Traditional HttpServlet Method
	@RequestMapping(path="/Process", method=RequestMethod.POST)
	public String Process(HttpServletRequest request){
		String Email = (String) request.getParameter("email");
		String Password = (String) request.getParameter("password");
		System.out.println(Email);
		System.out.println(Password);
		return "Success";
	}
	
	//Using Annotations created specifically for this
	//@RequestParam
	@RequestMapping(path="/Transfer", method=RequestMethod.POST)
	public String Transfer(@RequestParam("email") String UserEmail, @RequestParam("password") String UserPass){
		System.out.println(UserEmail);
		System.out.println(UserPass);
		return "Success";
	}

}
