package com.design.principal.solid;

public class HODChair implements Chair{

	@Override
	public void price() {
		System.out.println("PRICE: $500");
	}

	@Override
	public void rotate() {
		System.out.println("EASILY ROTATABLE 360 degree");
	}

	
}
