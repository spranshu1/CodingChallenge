package com.programs.challenges.hackerrank.minimumbribe;

public class MinimumBribes {
	// Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
    	if(q.length == 0) {
    		return;
    	} 
    	
    	boolean isChaotic = false;
    	int totalBribes = 0;
    	
    	int maxBribe = 0;
    	int i = 0;
    	int j = 1;
    	while(j < q.length) {
    		
    		if(q[i] > q[j] && (j + 1) < q.length && q[i] > q[j + 1]) {
    			if((j+2) < q.length && q[i] > q[j + 2]) {
    				isChaotic = true;
    				break;
    			}
    			swap(q, i, j+1);
    			totalBribes ++;
    			maxBribe += 2;
    		} else if(q[i] < q[j] && q[i] > q[j + 1]) {
    			if((j+2) < q.length && q[i] > q[j + 2]) {
    				isChaotic = true;
    				break;
    			}
    			swap(q, i, j+1);
    			totalBribes ++;
    			maxBribe += 2;
    		} else if(q[i] > q[j]) {
    			swap(q, i, j);
    			totalBribes ++;
    			i++;
    			j++;
    			maxBribe = 1;
    		} else {
    			i++;
    			j++;
    			maxBribe = 0;
    		}
    		if(maxBribe > 2) {
    			isChaotic = true;
    			break;
    		}	
    	}
    	
    	if(isChaotic)
    		System.out.println("Too chaotic");
    	else
    		System.out.println(totalBribes);

    }
    
    static void swap(int[]arr,int start,int end){
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end]=temp;		
	}

	public static void main(String[] args) {
		int [] arr = {1,2,5,3,4,7,8,6};
		minimumBribes(arr);
		for(int i : arr) {
			System.out.print(i+",");
		}
	}

}
