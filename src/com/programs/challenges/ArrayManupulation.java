package com.programs.challenges;

import java.util.Arrays;

public class ArrayManupulation {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		rotateArray(arr,5);
		System.out.println(Arrays.toString(arr));

	}
	
	
	public static void rotateArray(int[]arr,int d){
		int n = arr.length;
		if(d>n){
			System.err.println("Rotation index greater then size of array");
			return;
		}
		swap(arr, 0, d-1);
		swap(arr, d, n-1);
		swap(arr, 0, n-1);
	}
	
	
	public static void swap(int[]arr,int start,int end){
		int temp;
		while(start < end){
			temp = arr[start];
			arr[start] = arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	
	
	

}
