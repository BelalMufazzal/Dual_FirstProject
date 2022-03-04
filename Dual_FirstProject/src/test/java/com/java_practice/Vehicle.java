package com.java_practice;

public class Vehicle {

	static String name;
	double price;
	String color;
	
	
	public void getCar() {
		
		name  = "BMW";
		price = 50000.99;
		color = "Black";
		String model= "GLX";
		
				
		//System.out.println("Model: "+ model);
		System.out.println("Make= "+ name + " Cost="+ price  +" Color="+ color + "Model="+model );
		
			}
		
	public static void sellCar() {
		name  = "Toyota";
			
		
		System.out.println("Make :"+ name);
			
	}
	public static void getPrice(int x, int y) {
		int Value= x+y;
		System.out.println("value of car="+Value);
	
	
	//System.out.println("Total Price:" + x+y);
		
	}
	
	public void blackCar(String a) {
		a= "Sports Car";
		System.out.println("Car:"+ a);
				
		
	}
	int cost(int x, int y) {
	
		return x+y;
	
	}
	public static void main(String[] args) {
	
		Vehicle obj = new Vehicle();
		obj.getCar();
		Vehicle.sellCar();
		System.out.println("Return:"+ obj.cost(20000, 25000));
		obj.blackCar(name);
		Vehicle.getPrice(10000, 50000);
		

	}

}
