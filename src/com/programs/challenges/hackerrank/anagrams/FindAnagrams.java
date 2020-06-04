package com.programs.challenges.hackerrank.anagrams;


import java.util.ArrayList;
import java.util.List;

/**
 * Given two strings A and B find all possible anagrams of B in A and print index location
 * <pre class="code">
 * EXAMPLE
 * A = "cabcabfe"
 * B = "abc";
 * Output : [0,3]
 * </pre>
 */
public class FindAnagrams {

    public static void main(String[] args) {

        List<Integer> result = getAnagramsLocation("cbaebabacd","abc");

        System.out.println(result);

    }


    static List<Integer> getAnagramsLocation(String A, String B){
        if(A == null || A.length() == 0)
            return null;

        List<Integer> dataList = new ArrayList<>();

        int l = 0,r = 0;
        int count = B.length();
        int[]char_count = new int[26];

        for(int i=0;i < B.length();i++){
            char_count[B.charAt(i) - 'a']++;
        }

        while(r < A.length()){
            if(char_count[A.charAt(r++) - 'a']-- >= 1 ){
                count--;
            }

            if(count == 0){
                dataList.add(l);
            }

            if(r - l == B.length() && char_count[A.charAt(l++) - 'a']++ >= 0){
                count++;
            }

        }

        return dataList;

    }


}
