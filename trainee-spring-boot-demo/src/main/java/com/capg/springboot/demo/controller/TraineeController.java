package com.capg.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.capg.springboot.demo.model.Trainee;
import com.cpag.springboot.demo.service.TraineeService;


@Controller
public class TraineeController {
	
	@Autowired
	TraineeService service;
	
	@PostMapping("/login")
	public String getTraineeLogin(@RequestParam("tName") String txName,@RequestParam("password") String password, Model m) {
		
		m.addAttribute("tName", txName);
		m.addAttribute("password", password);
		
		return "link.jsp";
		
	}
	
	
	@PostMapping("/add")
	public String getTraineetName(@RequestParam("id") String tid, @RequestParam("name") String tName, @RequestParam("location") String location ,@RequestParam("domain") String domain, Model m) {
		m.addAttribute("id",tid);
		m.addAttribute("name",tName);
		m.addAttribute("location", location);
		m.addAttribute("domain", domain);
		
		return "show";
	}
//	
//	@PostMapping("/add")
//	 String addTrainee(@ModelAttribute Trainee t1, Model m) {
//		service.addTrainee(t1);
//		System.out.println(t1);
//		m.addAttribute("trainee", t1);
//		return "show";	
//	}
//	
	@GetMapping("/delete")
	public String deleteTrainee(@RequestParam("tId") int tId, Model m){
		boolean t1=service.getTrainee(tId);
		m.addAttribute("trainee", t1);
		return "show";
	}
	
	
	
	
	@GetMapping
	public String showAddTraineePage() {
		return "add-trainee";
	}

}
