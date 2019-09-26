package com.programs.challenges.hackerrank.fraudactivity;

import java.util.Arrays;

public class Solution {

	static int activityNotifications(int[] expenditure, int d) {
		
		Arrays.sort(expenditure);
		int notice = 0;
		int i = 0;
		int median = 0;
		for(int j = d; j < expenditure.length; j++) {
			median = getMedian(expenditure,i,j);
			if(expenditure[j] >= (2 * median)) {
				notice++;
			}
			i++;
		}
		return notice;
	}

	static int getMedian(int[] expenditure, int i, int j) {
		int [] arr = Arrays.copyOfRange(expenditure, i, j);
		int median = 0;
		int len = arr.length;
		if (len % 2 != 0) {
			median = arr[len / 2];
		} else {
			median = (arr[(len - 1) / 2] + arr[len / 2]) / 2;
		}
		return median;
	}

	public static void main(String[] args) {

		int[] expenditure = {2,3,4,2,3,6,8,4,5};
		System.out.println(activityNotifications(expenditure, 5));
	}

}
