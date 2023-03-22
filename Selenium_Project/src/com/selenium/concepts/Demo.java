package com.selenium.concepts;

public class Demo {
	
	public void Hari() {
      
		System.out.println("Hari");
	}
	
	{
		System.out.println("First Name");
	}
	
	public void Baskar() {

		System.out.println("Baskar");
	}
	
	static {
 
		System.out.println("Block");
	}
	
	public static void main(String[] args) {
		Demo a = new Demo();
		a.Baskar();
		a.Hari();
				
	}

}
