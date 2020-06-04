package com.programs.challenges.hackerrank.arraymanipulation;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array arr where 1 <= arr[i] <= n (n = size of array) find all duplicate values
 * <pre class="code">
 * EXAMPLE:
 * arr = {4,3,2,7,8,3,2,1}
 * output : [2,3]
 * </pre>
 */
public class AllDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,3,2,1};

        System.out.println(getDuplicateElements(arr,arr.length));

    }


    static List<Integer> getDuplicateElements(int[] arr, int n) {
        List<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < n; i++){

            int indexToModify = Math.abs(arr[i]) - 1;
            if(arr[indexToModify] < 0){
                duplicates.add(indexToModify + 1);
            } else {
                arr[indexToModify] = -arr[indexToModify];
            }

        }
        return duplicates;

    }
}
