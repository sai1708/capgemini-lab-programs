package com.capg.demo.springjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.demo.springjpa.Service.TraineeService;
import com.capg.demo.springjpa.model.Trainee;

@RestController
@CrossOrigin(origins= {"http://localhost:4200"})
@RequestMapping("/api")
public class TraineeController {
	
	@Autowired
	TraineeService service;
	
	@PostMapping("/trainees")
	public Trainee addTrainee(@RequestBody Trainee trainee) {
		return service.addTrainee(trainee);
	}
	
	@GetMapping("/trainees/id/{id}")
	public Trainee getTrainee(@PathVariable int id) {
		return service.getTrainee(id);
	}
	
	@GetMapping("/trainees")
	public List<Trainee> getAllTrainees(){
		return service.getAllTrainees();
	}
	
	@DeleteMapping("/trainees/id/{id}")
	public void deleteTrainee(@PathVariable int id) {
		service.deleteTrainee(id);
	}
	
	@PutMapping("/trainees")
	public Trainee updateTrainee(@RequestBody Trainee trainee) {
		return service.updateTrainee(trainee);
	}


}
