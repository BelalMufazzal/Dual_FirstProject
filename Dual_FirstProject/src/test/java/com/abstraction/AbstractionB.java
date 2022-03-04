package com.abstraction;

public class AbstractionB extends AbstractionA {

	@Override
	public void getsalary() {
	System.out.println(" My salary is 100000");
		
		}

	public static void main(String[] args) {
		AbstractionB obj = new AbstractionB();
	    obj.getsalary();
	    obj.gethouse();
	    obj.getmoney();
		
		
	}
		
	}
	
	
	


