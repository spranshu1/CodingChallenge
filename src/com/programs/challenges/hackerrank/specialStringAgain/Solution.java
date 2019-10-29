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
		String s = "aaaabcbaaaabcb";
		int len = s.length();
		int c, i = 0, j, ans = 0;
		int[] sameCharCount = new int[len];

		while (i < len) {
			j = i + 1;
			c = 1;
			while (j < len && s.charAt(i) == s.charAt(j)) {
				++j;
				++c;
			}

			// total substrings which have all same char(s)
			ans += (c * (c + 1)) >> 1;
			sameCharCount[i] = c;
			i = j;
		}

		for (j = 1; j < len - 1; ++j) {
			if (s.charAt(j) == s.charAt(j - 1)) {
				sameCharCount[j] = sameCharCount[j - 1];
			}

			// odd length substr(s) which has middle element diiferent
			if (s.charAt(j - 1) == s.charAt(j + 1) && s.charAt(j) != s.charAt(j - 1)) {
				ans += Math.min(sameCharCount[j - 1], sameCharCount[j + 1]);
			}
		}
		System.out.println(ans);
	}

	//Not used
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
