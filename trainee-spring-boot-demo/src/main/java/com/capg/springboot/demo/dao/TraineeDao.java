package com.capg.springboot.demo.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.capg.springboot.demo.model.Trainee;


@Repository
public class TraineeDao {
	
Map<Integer, Trainee> trainees=new HashMap<Integer, Trainee>();
	
	public Trainee addTrainee(Trainee t1) {
		trainees.put(t1.getId(), t1);
		return t1;
	}

	public boolean deleteTrainee(int tId) {
		// TODO Auto-generated method stub
		if(trainees.containsKey(tId))
		trainees.remove(tId);
		return true;
	}


}
