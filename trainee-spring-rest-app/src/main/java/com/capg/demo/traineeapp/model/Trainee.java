package com.capg.demo.traineeapp.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class Trainee {
	private int traineeId;
	private String traineeName;
	private String traineeDomain;
	private String traineeLocation;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate traineeDob;
	
	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", traineeDomain=" + traineeDomain
				+ ", traineeLocation=" + traineeLocation + ", traineeDob=" + traineeDob + "]";
	}
	
	
	

	public Trainee(int traineeId, String traineeName, String traineeDomain, String traineeLocation,
			LocalDate traineeDob) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.traineeDomain = traineeDomain;
		this.traineeLocation = traineeLocation;
		this.traineeDob = traineeDob;
	}




	public LocalDate getTraineeDob() {
		return traineeDob;
	}

	public void setTraineeDob(LocalDate traineeDob) {
		this.traineeDob = traineeDob;
	}

	public Trainee() {
		// TODO Auto-generated constructor stub
	}

	public int getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public String getTraineeDomain() {
		return traineeDomain;
	}

	public void setTraineeDomain(String traineeDomain) {
		this.traineeDomain = traineeDomain;
	}

	public String getTraineeLocation() {
		return traineeLocation;
	}

	public void setTraineeLocation(String traineeLocation) {
		this.traineeLocation = traineeLocation;
	}
	
	
	
	
	
}
