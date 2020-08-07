package com.capg.demo.springjpa.Service;


import java.util.List;

import javax.management.RuntimeErrorException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.demo.springjpa.model.Trainee;
import com.capg.demo.springjpa.repo.TraineeDataJpaRepo;
import com.capg.demo.springjpa.repo.TraineeJpaRepo;


@Service
public class TraineeService {

	@Autowired
	TraineeJpaRepo repo;
	
	@Autowired
	TraineeDataJpaRepo dataJpaRepo;
	
	@Transactional
	public Trainee addTrainee(Trainee trainee) {
		//return repo.addTrainee(trainee);
		if(dataJpaRepo.existsById(trainee.getTraineeId())){
			throw new RuntimeException("Trainee Already Exists");
		}
		return dataJpaRepo.save(trainee);
	}
	
	@Transactional
	public Trainee getTrainee(int traineeId) {
		//return repo.getTraineeById(traineeId);

		return dataJpaRepo.getOne(traineeId);
	}
	
	@Transactional
	public List<Trainee> getAllTrainees(){
		// return repo.getAllTrainees();
		
		return dataJpaRepo.findAll();
	
	}
	
	@Transactional
	public void deleteTrainee(int traineeId) {
		//repo.deleteTraineeById(traineeId);
		
		dataJpaRepo.deleteById(traineeId);
	}
	
	public Trainee updateTrainee(Trainee trainee) {
		Trainee tr=dataJpaRepo.getOne(trainee.getTraineeId());
		tr.setTraineeDomain(trainee.getTraineeDomain());
		tr.setTraineeLocation(trainee.getTraineeLocation());
		tr.setTraineeName(trainee.getTraineeName());
		tr.setTraineeDob(trainee.getTraineeDob());
		return dataJpaRepo.save(tr);
		
	}
	
	
	
}