package com.programs.challenges.hackerrank.arraymanipulation;

/**
 * Given an array that is sorted and then rotated around an unknown point.
 * Find if the array has a pair with a given sum ‘x’.
 * It may be assumed that all elements in the array are distinct.
 * <pre class"code">
 * EXAMPLE
 * Input: arr[] = {11, 15, 6, 8, 9, 10}, x = 16
 * Output: true
 * There is a pair (6, 10) with sum 16
 *
 * Input: arr[] = {11, 15, 26, 38, 9, 10}, x = 35
 * Output: true
 * There is a pair (26, 9) with sum 35
 *
 * Input: arr[] = {11, 15, 26, 38, 9, 10}, x = 45
 * Output: false
 * There is no pair with sum 45.
 * </pre>
 */
public class RotatedArrayPairSearch {
    public static void main(String[] args) {
        int[]arr = {11, 15, 6, 8, 9, 10};
        int x = 16;

        if(checkPairExist(arr,x))
            System.out.println("There is a pair with sum "+x);
        else
            System.out.println("There is no pair with sum "+x);
    }

    static boolean checkPairExist(int[]arr,int x){

        int left,right;

        int length=arr.length-1;

        int pivot = findPivot(arr,0,length);

        left = pivot;
        right = pivot+1;

        while (left != right){
            if(left < 0)
                left = length;

            if(right > length)
                right = 0;

            if(arr[left] + arr[right] == x)
                return true;

            if(arr[left] + arr[right] > x)
                left--;
            else
                right++;

        }

        return false;

    }

    static int findPivot(int[]arr,int low,int high){

        if(high < low)
            return -1;
        if(high==low)
            return low;

        int mid = (low + high)/2;

        if(mid < high && arr[mid] > arr[mid + 1]){
            return mid;
        }
        if(mid > low && arr[mid] < arr[mid - 1]){
            return mid - 1;
        }
        if(arr[low] >= arr[high]){
            return findPivot(arr,low,mid-1);
        }
        return findPivot(arr,mid+1,high);
    }

}
