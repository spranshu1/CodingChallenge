package com.programs.challenges;

public class UniqueElementInArray {
	
	public static void main(String[] args) {
		int ar[] = {2, 3, 5, 4, 5, 3, 4, 2, 1};
		char arr[] = {'a','b','c','a'};
		int result = findSingle(arr, arr.length);
		System.out.println("Unique element is : "+result);
	}

	
	static int findSingle(int ar[], int ar_size) { 
        // Do XOR of all elements and return 
        int res = ar[0]; 
        for (int i = 1; i < ar_size; i++) 
            res = res ^ ar[i]; 
      
        return res; 
    } 
	
	static int findSingle(char ar[], int ar_size) {
		
		char res = ar[0];
		for (int i = 1; i < ar_size; i++) 
            res = (char) (res ^ ar[i]); 
      
        return res; 
	}
}
