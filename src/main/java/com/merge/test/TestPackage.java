package com.merge.test;

public class TestPackage {

	private String string;

	public static void main(String[] s) {
		System.out.println("Test");
		calculate(4, 5);
	}
	
	public static void calculate(int a, int b) {
		System.out.println(a+b);
	}
	
	public void getString() {
		return string;
	}
}
