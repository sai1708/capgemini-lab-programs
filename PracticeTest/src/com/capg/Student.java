package com.capg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student {
	String name;
	int age;
	int height;
	public Student(String name, int age, int height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", height=" + height + "]";
	}
}
	
	class Sortbyname implements Comparator<Student> 
	{ 
	    public int compare(Student a, Student b) 
	    { 
	        return a.name.compareTo(b.name); 
	    } 
	} 
	
	class Sortbyage implements Comparator<Student> 
	{ 
	    public int compare(Student a, Student b) 
	    { 
	        return a.age - b.age; 
	    } 
	} 
	
	class Sortbyheight implements Comparator<Student> 
	{ 
	   
	    public int compare(Student a, Student b) 
	    { 
	    	return a.height-b.height;
	    } 
	}
	
	class Result{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> array = new ArrayList<Student>(); 
        array.add(new Student("sai",20,120)); 
        array.add(new Student("nagendra", 50, 150)); 
        array.add(new Student("pradeep",10,140)); 
        
        System.out.println("unsorted");
        for (int i=0; i<array.size(); i++) 
            System.out.println(array.get(i)); 
     
  
       // Collections.sort(array,(t1,t2)->t1.name.compareTo(t2.name)); 
        Collections.sort(array,(t1,t2)->t1.age-t2.age);
        //Collections.sort(array,(t1,t2)->t1.height-t2.height);
        
        
        System.out.println("student list:");
        for (int i=0; i<array.size(); i++) 
            System.out.println(array.get(i)); 
             
	}
	}
	

	
