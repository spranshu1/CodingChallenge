package com.programs.challenges.hackerrank.arraymanipulation;

/**
 * Given a sorted array (sorted in non-decreasing order) of positive numbers,
 * find the smallest positive integer value that cannot be represented as sum of elements of any subset of given set.
 * Expected time complexity is O(n)
 * <pre class="code">
 * EXAMPLE:
 * Input:  arr[] = {1, 3, 6, 10, 11, 15};
 * Output: 2
 *
 * Input:  arr[] = {1, 1, 1, 1};
 * Output: 5
 *
 * Input:  arr[] = {1, 1, 3, 4};
 * Output: 10
 *
 * Input:  arr[] = {1, 2, 5, 10, 20, 40};
 * Output: 4
 *
 * Input:  arr[] = {1, 2, 3, 4, 5, 6};
 * Output: 22 *
 * </pre>
 *
 */
public class SmallestInteger {
    public static void main(String[] args) {

        int arr1[] = {1, 3, 4, 5};
        int n1 = arr1.length;
        System.out.println(getSmallestValue(arr1, n1));

        int arr2[] = {1, 2, 6, 10, 11, 15};
        int n2 = arr2.length;
        System.out.println(getSmallestValue(arr2, n2));

        int arr3[] = {1, 1, 1, 1};
        int n3 = arr3.length;
        System.out.println(getSmallestValue(arr3, n3));

        int arr4[] = {1, 1, 3, 4};
        int n4 = arr4.length;
        System.out.println(getSmallestValue(arr4, n4));

    }

    static int getSmallestValue(int[] arr, int N){

        int result = 1;

        for(int i=0; i < N && arr[i] <= result; i++){
            result = result + arr[i];
        }

        return result;
    }
}
