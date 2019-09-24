package com.programs.challenges.hackerrank.fraudactivity;

import java.util.Arrays;

public class Solution {

	static int activityNotifications(int[] expenditure, int d) {
		
		Arrays.sort(expenditure);

		int i = 0;
		int median = 0;
		for(int j = d-1; j < expenditure.length - 1; j++) {
			median = getMedian(expenditure,i,j);
			
			
		}
		
		

		return 0;
	}

	static int getMedian(int[] expenditure, int i, int j) {
		int [] arr = Arrays.copyOfRange(expenditure, i, j);
		int median = 0;
		int len = arr.length;
		if (len % 2 != 0) {
			median = expenditure[len / 2];
		} else {
			median = (expenditure[(len - 1) / 2] + expenditure[len / 2]) / 2;
		}
		return median;
	}

	public static void main(String[] args) {

	}

}
