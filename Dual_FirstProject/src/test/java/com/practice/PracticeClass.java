package com.practice;

public class PracticeClass {
	
	static int number;
	String name;
	
	public static void getSalary() {
		number=500;
		System.out.println("Nunmer=" +number);
	
	}
	
	public void getPhone() {
		name= "Frank";
		number  = 250;
		System.out.println(name);
		System.out.println( number);
		}

	
	public void getName() {
		name= "David";
		number  = 100;
		System.out.println(name);
		System.out.println( number);
		}
	public static void getCar() {
			System.out.println("I have a Car");
	}
	    public void getHouse() {

		System.out.println("I have one House");
		}
public static void main(String[] args) {
	
	PracticeClass obj = new PracticeClass();
	obj.getHouse();
	obj.getName();
	PracticeClass.getCar();
	PracticeClass.getSalary();
	obj.getPhone();
	
	
}	    
	    
}
