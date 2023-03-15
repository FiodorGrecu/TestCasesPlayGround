package com.noorteck.test.cases;

public class Equals {
	
	public static void main(String[] args) {
		String s1 = "John";
		String s2 = new String("John");
		
		
		if (s1==s2) {
			System.out.println("Equals");
		}else {
			System.out.println("Not Equals");
		}
	}


}
