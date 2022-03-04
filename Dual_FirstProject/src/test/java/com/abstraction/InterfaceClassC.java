package com.abstraction;

public class InterfaceClassC implements InterfaceA, InterfaceB {

	public void getCar() {
		System.out.println(" MBW");
	}
	public void getPhone() {
		System.out.println("Iphone");
	}
	public void getJob() {
		System.out.println(" Automation");
	}
	public void getCash() {
		System.out.println("$90000");
		}

	public void getbonus() {
		System.out.println("$2000");
		}
	public static void main(String[] args) {
		InterfaceClassC obj = new InterfaceClassC();
		obj.getJob();
		obj.getCar();
		obj.getbonus();
		obj.getPhone();
		obj.getCash();
	}
}
