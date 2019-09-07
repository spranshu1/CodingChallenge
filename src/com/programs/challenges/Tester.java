package com.programs.challenges;

public class Tester {

	public static void main(String[] args) {
		System.out.println(encode("code"));
		System.out.println(decode(encode("code")));
	}

	static String encode(String input){
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < input.length();i++){
			char c = input.charAt(i);
			b.append(c += c + i);
		}
		return b.reverse().toString();
	}

	static String decode(String input){
		StringBuilder b = new StringBuilder(input);
		input = b.reverse().toString();
		String result = "";
		for (int i = 0 ; i < input.length() ;i++){
			char c = input.charAt(i);

			result += Character.toString(c -= c - i);
		}
		return result;
	}

}
