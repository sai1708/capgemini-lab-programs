package com.capg.demos;

import java.sql.SQLException;
import java.util.Scanner;

import com.capg.demos.controller.TraineeController;
import com.capg.demos.model.Trainee;

/**
 * Hello world!
 *
 */




public class App 
{
	static Scanner in=new Scanner(System.in);
	//static TraineeController controller=new TraineeController();
	public static void main( String[] args ) throws SQLException
    {
		//TraineeController controller=new TraineeController();
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

    private static void getaddTrainee() throws SQLException {
		// TODO Auto-generated method stub
    	TraineeController controller=new TraineeController();
    	//Trainee t1;
    	int id;
    	String name;
    	String email;
    	 System.out.println( "Enter Trainee Details - (Id,Name,email)" );
    	System.out.println("Enter ID:");
    	id=in.nextInt();
    	System.out.println("Enter Name:");
    	name=in.next()+in.nextLine();
    	System.out.println("Enter Email:");
    	email=in.next()+in.nextLine();
    	
    	Trainee trainee=new Trainee(id,name,email);
    	try {
    	Trainee addedTrainee=controller.addTrainee(trainee);
    	System.out.println("Trainee Added "+addedTrainee);
    	
    	}
    	catch (Exception e) {
    		
			System.out.println("Error...");
			e.printStackTrace();
		}
   
    	
       
    }
	
	
	private static void removeTrainee() throws SQLException {
		// TODO Auto-generated method stub
		TraineeController controller=new TraineeController();
		System.out.println("Enter id");
		int id=in.nextInt();
		try {
			int deletedTrainee=controller.deleteTrainee(id);	
			System.out.println("Trainee Deleted "+deletedTrainee);
		}
		catch(Exception e) {
		System.out.println("Error");
		e.printStackTrace();
		}
	}
	private static void searchTrainee() throws SQLException {
		// TODO Auto-generated method stub
		TraineeController controller=new TraineeController();
		System.out.println("Enter id");
		int id=in.nextInt();
		try {
			int searchedTrainee=controller.findTrainee(id);	
			System.out.println("Trainee found "+searchedTrainee);
		}
		catch(Exception e) {
		System.out.println("Error");	
		e.printStackTrace();
		}
	}
		
	}

