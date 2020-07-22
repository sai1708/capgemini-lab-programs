package com.capg.demos.controller;

import java.sql.SQLException;

import com.capg.demos.model.Trainee;
import com.capg.demos.service.TraineeService;
import com.capg.demos.service.TraineeServiceImpl;

public class TraineeController {

	TraineeService service;
	
	public TraineeController() throws SQLException {
	service=new TraineeServiceImpl();
	}
	
	public Trainee addTrainee(Trainee trainee) throws SQLException {
		return service.addTrainee(trainee);
	}
	public int deleteTrainee(int id) throws SQLException {
		// TODO Auto-generated method stub
		return service.deleteTrainee(id);
		
	}
	public int findTrainee(int id) throws SQLException {
		// TODO Auto-generated method stub
		return service.getTrainee(id);
	}


	
	
}
