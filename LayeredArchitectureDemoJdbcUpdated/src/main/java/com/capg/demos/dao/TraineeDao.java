package com.capg.demos.dao;

import java.sql.SQLException;

import com.capg.demos.model.Trainee;

public interface TraineeDao {

	public Trainee addTrainee(Trainee trainee) throws SQLException;
	public int findTrainee(int id) throws SQLException;
	public int removeTrainee(int id) throws SQLException;
}
