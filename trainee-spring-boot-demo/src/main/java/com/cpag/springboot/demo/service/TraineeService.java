package com.cpag.springboot.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.springboot.demo.dao.TraineeDao;
import com.capg.springboot.demo.model.Trainee;


@Service
public class TraineeService {

	@Autowired
	TraineeDao dao;	
	
	public Trainee addTrainee(Trainee t1) {
		// TODO Auto-generated method stub
		return dao.addTrainee(t1);
	}

	public boolean getTrainee(int tId) {
		// TODO Auto-generated method stub
		return dao.deleteTrainee(tId);
	}

}
