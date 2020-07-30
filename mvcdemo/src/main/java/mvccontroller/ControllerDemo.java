package mvccontroller;

import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerDemo {
	@GetMapping("/message")
	public String getMessage(Model m) {
		m.addAttribute("msg","Hello Sir...");
		m.addAttribute("date", LocalDate.now());
		return "show";
	}
	@RequestMapping("/login")
	public String add(HttpServletRequest req,Model m) {
		m.addAttribute("uName", req.getParameter("uName"));
		m.addAttribute("uId", req.getParameter("uId"));
		m.addAttribute("uSalary", req.getParameter("uSalary"));
		return "show";
		
	}


}
