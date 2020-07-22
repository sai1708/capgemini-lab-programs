package com.capg.demos.service;

import com.capg.demos.dao.TraineeDao;
import com.capg.demos.dao.TraineeDaoCollectionsBasedImpl;
import com.capg.demos.model.Trainee;

public class TraineeServiceImpl implements TraineeService {
	
	TraineeDao dao;
	public TraineeServiceImpl() {
		dao=new TraineeDaoCollectionsBasedImpl();
	}

	@Override
	public void addTrainee(Trainee trainee) {
		dao.addTrainee(trainee);
		
	}

	@Override
	public void deleteTrainee(int id) throws InvalididException {
		// TODO Auto-generated method stub
		if(id<0) {
			throw new InvalididException("IN-Valid ID entered");
		}
		dao.deleteTrainee(id);
		
	}

	@Override
	public Trainee getTrainee(int id) throws InvalididException {
		// TODO Auto-generated method stub
		if(id<0) {
			throw new InvalididException("IN-Valid ID entered");
		}
		dao.getTrainee(id);
		return null;
	}

}
