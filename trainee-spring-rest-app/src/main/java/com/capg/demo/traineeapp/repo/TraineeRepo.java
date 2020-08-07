package com.capg.demo.traineeapp.repo;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.capg.demo.traineeapp.model.Trainee;

@Repository
public class TraineeRepo {

	
	
	Map<Integer, Trainee> trainees=new HashMap<>();
	
	
	@PostConstruct
	public void addDummyTrainees() {
		trainees.put(101,new Trainee(101,"Mahesh","DevOps","Bangalore",LocalDate.of(1999,05,12)));
		trainees.put(102,new Trainee(102,"Rohit","Java","Bangalore",LocalDate.of(1998,12,10)));
		trainees.put(103,new Trainee(103,"Manoj","Testing","Chennai",LocalDate.of(1995,06,18)));
		trainees.put(104,new Trainee(104,"Rahul","Angular","Hyderabad",LocalDate.of(1996,04,12)));
	}
	
	
	public Trainee addTrainee(Trainee trainee) {
		trainees.put(trainee.getTraineeId(), trainee);
		return trainee;
	}
	
	public Trainee getTrainee(int id) {
		return trainees.get(id);
	}
	
	public List<Trainee> getAllTrainee(){
		return trainees.values().stream().collect(Collectors.toList());
	}
	public void deleteTrainee(int id) {
		trainees.remove(id);
		System.out.println("deleted");
	}
	
}
