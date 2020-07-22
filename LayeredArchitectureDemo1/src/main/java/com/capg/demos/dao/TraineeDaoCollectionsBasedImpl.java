package com.capg.demos.dao;

import java.util.HashMap;
import java.util.Map;

import com.capg.demos.model.Trainee;

public class TraineeDaoCollectionsBasedImpl implements TraineeDao {
	
	Map<Integer, Trainee> trainers=new HashMap<Integer, Trainee>();
	
	public TraineeDaoCollectionsBasedImpl() {
		addsomeTrainee();
	}

	private void addsomeTrainee() {
		// TODO Auto-generated method stub
		Trainee t1=new Trainee(1000,"sai","sai@gmail.com");
		Trainee t2=new Trainee(1001,"nagendra","nag@gmail.com");
		
		trainers.put(t1.getId(),t1);
		trainers.put(t2.getId(), t2);
	}

	@Override
	public void addTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		trainers.put(trainee.getId(),trainee);
		System.out.println(trainers);
	}

	@Override
	public Trainee getTrainee(int id) {
		// TODO Auto-generated method stub
		Trainee trainee = null;
		for (Map.Entry<Integer, Trainee> mapper:trainers.entrySet()) {
			
			
			if(mapper.getKey().equals(id))
			{
				trainee=mapper.getValue();
			}
		
		}
		return trainee;
		
	}

	@Override
	public void deleteTrainee(int id) {
		// TODO Auto-generated method stub
		trainers.remove(id);
	}

}
