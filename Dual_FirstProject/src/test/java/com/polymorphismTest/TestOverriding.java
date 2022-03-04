package com.polymorphismTest;

public class TestOverriding extends OverridingB {
	
	
	
	public void getFreeAirTicket() {
	System.out.println(" I won free Air Ticket ");
		
	}	
	public void getFreeHotel() {
		
	System.out.println(" I also won free accomodation");
		
	}
	
	public void getPhone () {
	System.out.println(" This is very old phone");
	}
	public static void main(String[] args) {
		
		TestOverriding obj = new TestOverriding();
		obj.getFreeAirTicket();
		obj.getFreeHotel();
		obj.getPhone();
		
	}
}
