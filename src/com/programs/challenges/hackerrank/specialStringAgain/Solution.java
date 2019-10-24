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
 * @date Oct 24, 2019
 */
package com.programs.challenges.hackerrank.specialStringAgain;

public class Solution {

	public static void main(String[] args) {
		String s = "aaaa";
		/*
		 * int len = s.length(); long counter = len; for (int i = 0; i < len; i++) { for
		 * (int j = i + 1; j < len; j++) { String val = s.substring(i, j + 1); if
		 * (isPalindrome(val)) { counter++; } } } System.out.println(counter);
		 */
		System.out.println(subStrCount(s, 7));
	}
	
	public static long subStrCount(String s, int len) {
		long count = len;
		
				
        count += s.substring(0, (int)(4 % len)).length();
        
        return count - 1;
	}

	public static boolean isPalindrome(String val) {
		boolean isPalindrome = true;
		int len = val.length();
		if (len > 4) {
			isPalindrome = false;
		} else {
			for (int i = 0; i < len; i++) {
				if (val.charAt(i) != val.charAt(len - i - 1)) {
					isPalindrome = false;
				}
			}
		}
		return isPalindrome;
	}
}
