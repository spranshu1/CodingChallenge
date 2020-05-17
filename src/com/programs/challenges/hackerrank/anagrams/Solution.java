/**
 * These materials are confidential and proprietary to Intellect Design Arena Ltd. and no part of these
 * materials should be reproduced, published, transmitted or distributed in any form or by any means,
 * electronic, mechanical, photocopying, recording or otherwise, or stored in any information storage or
 * retrieval system of any nature nor should the materials be disclosed to third parties or used in any
 * other manner for which this is not authorized, without the prior express written authorization of
 * Intellect Design Arena Ltd.
 *
 * Copyright 2017 Intellect Design Arena Limited. All rights reserved.
 *
 * @author pranshu.shrivastava
 * @date Sep 30, 2019
 */
package com.programs.challenges.hackerrank.anagrams;

public class Solution {

	// Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
    	int count1[] = new int[26];  
        int count2[] = new int[26]; 
        int result = 0;
  
        // count frequency of each character  
        // in first string 
        for (int i = 0; i < a.length() ; i++) 
            count1[a.charAt(i) -'a']++; 
      
        // count frequency of each character  
        // in second string 
        for (int i = 0; i < b.length() ; i++) 
            count2[b.charAt(i) -'a']++; 
  
        for(int i = 0; i < 26; i++) {
        	result += Math.abs(count1[i] - count2[i]);
        }

    	return result;
    }
    
	public static void main(String[] args) {
		String a = "ebe";
		String b = "abc";
		System.out.println(makeAnagram(a, b));
	}

}
 