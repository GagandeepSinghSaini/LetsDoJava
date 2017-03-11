package com.design.principal.solid;

public class ClerkChair implements Chair
{

	@Override
	public void price() {
		System.out.println("PRICE: $100");
	}

	@Override
	public void rotate() {
		System.out.println("NON-ROTATE");
		
	}

}
