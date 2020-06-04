package com.programs.challenges.string;


/**
 * Given a string find first non duplicate character. i.e. First character whose occurrence is one time
 * <pre class="code">
 * EXAMPLE:
 * A = "aaabcccdff";
 * result = b;
 * As 'b' appears only once and first non duplicate char
 * </pre>
 */
public class FirstNonDuplicateChar {

    public static void main(String[] args) {

        String input = "aaabbcccdff";

        System.out.println(findFirstUniqueChar(input));

    }


    static char findFirstUniqueChar(String input){
        int len = input.length();

        int[] count = new int[26];

        for(int i=0;i < len;i++){
            count[input.charAt(i) - 'a']++;
        }

        for(int j=0;j < len;j++){
            int index = input.charAt(j) - 'a';
            if(count[index] == 1){
                return input.charAt(j);
            }
        }

        return '_';

    }


}
