package com.polymorphismTest;

public class OverloadingA {
	
	public void login(int a) {
	System.out.println(" Login by Password");
		
		}
	public void login (String b,int c ) {
	System.out.println(" Login by username and Password ");
	}
	
	public void login(int d,String e) {
		
	System.out.println(" Login by Password and username");	
		
	}
	public static void main(String[] args) {
		
		OverloadingA obj = new OverloadingA();
		obj.login(1234);
		obj.login("Mango", 1234);
		obj.login(1234, "Mango");
		
		}
}



