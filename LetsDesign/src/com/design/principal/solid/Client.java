package com.design.principal.solid;

public class Client {

	private static Chair chair = null;
	public static void main(String[] args) {
		chair = new HODChair();
		System.out.print("HODChair: ");
		chair.price();
		chair.rotate();
		
		chair = new ClerkChair();
		System.out.print("ClerkChair: ");
		chair.price();
		chair.rotate();
	}
}
