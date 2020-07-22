package com.capg.demos;

import java.util.Scanner;

import com.capg.demos.dao.TraineeDaoCollectionsBasedImpl;
import com.capg.demos.model.Trainee;
import com.capg.demos.service.InvalididException;
import com.capg.demos.service.TraineeServiceImpl;

public class App {
static Scanner in=new Scanner(System.in);
  static TraineeServiceImpl serviceobj=new TraineeServiceImpl();
  static Trainee traineeobj=new Trainee();
  static TraineeDaoCollectionsBasedImpl daoobj=new TraineeDaoCollectionsBasedImpl();
    public static void main( String[] args ) throws InvalididException
    {
        for(;;) {
        	int choice;
        	System.out.println("Enter your choice...");
        	System.out.println("1-addTrainee");
        	System.out.println("2-deleteTrainee");
        	System.out.println("3-findTrainee");
        	System.out.println("4-Exit");
        	choice=in.nextInt();
        	switch(choice) {
        	case 1:
        		getaddTrainee();
        		break;
        	case 2:
        		removeTrainee();
        		break;
        	case 3:
        		searchTrainee();
        		break;
        	case 4:
        		System.exit(0);
        		break;
        	default:
        		System.out.println("Invalid Choice");
        		break;
        		
        	}
        }
    }

	private static void searchTrainee() throws InvalididException {
		// TODO Auto-generated method stub
		System.out.println("Enter id");
		int id=in.nextInt();
		serviceobj.getTrainee(id);
		System.out.println("trainee found");
		
	}
	private static void removeTrainee() throws InvalididException {
		// TODO Auto-generated method stub
		System.out.println("Enter id");
		int id=in.nextInt();
		serviceobj.deleteTrainee(id);
		System.out.println("deleted successfully");
		
	}
	private static void getaddTrainee() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter id");
		int id=in.nextInt();
		System.out.println("Enter name");
		String name=in.next();
		System.out.println("Enter email");
		String email=in.next();
		traineeobj.setId(id);
		traineeobj.setName(name);
		traineeobj.setEmail(email);
	serviceobj.addTrainee(traineeobj);
		
		}
	}

