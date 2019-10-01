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
 * @date Oct 1, 2019
 */
package com.programs.challenges.hackerrank.sherlock;

public class Solution {

	static String isValid(String s) {
		int [] count = new int [26];
		int remcounter = 0;
		String result = "YES";
		int lastLen = 0;
		for(int i = 0 ; i < s.length(); i++) {
			count[s.charAt(i) -'a']++;
		}
		
		for(int i = 0 ; i < 26;i++) {
			if(count[i] % 2 != 0) {
				count[i]--;
				remcounter++;
				if(count[i] != count[i+1]) {
					result = "NO";
					break;
				}
			} else {
				lastLen = count[i];
			}
			if(remcounter > 1) {
				result = "NO";
				break;
			}
			if(lastLen != count[i]) {
				result = "NO";
				break;
			}
						
		}
		return result;
	}

	public static void main(String[] args) {
		String s = "aaaabbcc";
		System.out.println(isValid(s));
	}

}
