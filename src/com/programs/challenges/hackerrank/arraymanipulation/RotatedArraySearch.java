package com.programs.challenges.hackerrank.arraymanipulation;


import com.programs.challenges.algorithms.AlgoHelper;

import java.util.Arrays;

/**
 * Given a rotated sorted array find the element 'k'
 * <pre class="code">
 * EXAMPLE:
 * arr = {3,4,5,1,2}
 * k = 2
 *
 * </pre>
 */
public class RotatedArraySearch {

    public static void main(String[] args) {
        int[] arr = {5,7,1,2,3,4};
        int result = search(arr,4);
        if(result < 0)
            System.out.println("Value not found");
        else
            System.out.println("Value present at index : "+result);
    }

    static int search(int[] arr, int k){
        if(arr == null || arr.length == 0)
            return -1;

        int index;
        int l=0,r=arr.length-1;

        int pivot = findPivot(arr,l,r);

        if(k >= arr[0]){
            index = AlgoHelper.binarySearch(arr,0,pivot,k);
        } else {
            index = AlgoHelper.binarySearch(arr,pivot+1,r,k);
        }

        return index;

    }

    static int findPivot(int[] arr,int l,int r){
        if(r < l)
            return -1;
        if(r == l)
            return l;

        int mid = (l + r)/2;
        if(mid < r && arr[mid] > arr[mid+1])
            return mid;
        if(mid > l && arr[mid] < arr[mid - 1])
            return mid - 1;
        if(arr[l] >= arr[r])
            return findPivot(arr,l,mid-1);

        return findPivot(arr,mid+1,r);



    }

}
