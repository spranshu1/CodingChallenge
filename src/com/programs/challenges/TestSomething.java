package com.programs.challenges;

import java.text.ParseException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestSomething {

	public static void main(String[] args) throws ParseException {
		
		String names = "John Doe; Peter Benjamin Parker; Mary Jane Watson-Parker; John Elvis Doe; John Evan Doe; Jane Doe; Peter Brian Parker";
		
		System.out.println(solution(names,"Example"));
	}

	public static String solution(String S, String C) {
					
		List<String> names = Arrays.asList(S.split("; "));
		
		return generateEmail(names, C);

	}
	
	private static String generateEmail(List<String> names, String C) {
		Map<String, Integer> nameCount = new HashMap<String, Integer>();
		
		String commaSeperatedEmails = ""; 
		
		for(int i=0;i<names.size();i++) {
			
			String name = names.get(i); 
			
			String email = "";
						
			String [] splitedName = name.toLowerCase().split(" ");
			
			String fullName = "";
			
			String lastName = "";
			
			String firstName = splitedName[0] == null ? "" : splitedName[0];
			
			if(splitedName != null && splitedName.length > 2) {
				fullName = splitedName[0]+"."+splitedName[2];
				
				String temp = splitedName[2].replace("-", "");
				
				if(temp.length() > 8) {
					lastName = temp.substring(0, 8);
				} else {
					lastName = temp;
				}
				
								
			} else if(splitedName != null){
				fullName = splitedName[0]+"."+splitedName[1];
				String temp = splitedName[1].replace("-", "");
				
				if(temp.length() > 8) {
					lastName = temp.substring(0, 8);
				} else {
					lastName = temp;
				}
			}
			
			if(nameCount.containsKey(fullName)) {
				nameCount.put(fullName, nameCount.get(fullName) + 1);
				int count = nameCount.get(fullName);
				email = name + " "+"<"+ firstName +"."+lastName+count+"@"+C.toLowerCase()+".com"+">";
			} else {
				nameCount.put(fullName, 1);
				email = name + " "+"<"+ firstName +"."+lastName+"@"+C.toLowerCase()+".com"+">";
			}
				
			if(i != names.size()-1) {
				commaSeperatedEmails += email+"; ";
			} else {
				commaSeperatedEmails += email;
			}
			
			
		}
		
		
		return commaSeperatedEmails;
	}

}
