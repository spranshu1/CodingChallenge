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
package com.programs.challenges.hackerrank.alternatingcharacters;

public class Solution {
	
	// Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
    	char [] arr = s.toCharArray();
    	int count = 0;
    	char c = ' ';
    	for(int i = 0 ; i < s.length();i++) {
    		if(c == arr[i]) {
    			count++;
    		} else {
    			c = arr[i];
    		}
    	}

    	return count;
    }

	public static void main(String[] args) {
		String s = "BABABABB";
		System.out.println(alternatingCharacters(s));
	}

}
