package com.capg.service;

import com.capg.dao.ITraineeDao;
import com.capg.dao.TraineeDaoImpl;
import com.capg.model.Trainee;

public class TraineeServiceImpl implements ITraineeService {
ITraineeDao dao;

	public TraineeServiceImpl() {
		dao=new TraineeDaoImpl();
	// TODO Auto-generated constructor stub
}

	@Override
	public Trainee addTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		return dao.addTrainee(trainee);
	}

	@Override
	public Trainee findTrainee(int id) {
		// TODO Auto-generated method stub
		return dao.findTrainee(id);
	}

	@Override
	public boolean removeTrainee(int id) {
		// TODO Auto-generated method stub
		return dao.removeTrainee(id);
	}

}
