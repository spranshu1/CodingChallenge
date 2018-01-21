package com.programs.challenges;

public class TestSomething {

	public static void main(String[] args) {
		String fieldName = "eMail";
		fieldName = fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
		System.out.println(fieldName);
	}

}
