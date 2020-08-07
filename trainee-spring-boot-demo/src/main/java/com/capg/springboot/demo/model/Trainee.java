package com.capg.springboot.demo.model;

public class Trainee {
	
	private int id;
	private String name;
	private String location;
	private String domain;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public Trainee(int id, String name, String location, String domain) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.domain = domain;
	}
	@Override
	public String toString() {
		return "Trainee [id=" + id + ", name=" + name + ", location=" + location + ", domain=" + domain + "]";
	}
	
	
	

}
