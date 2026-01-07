package com.programs.challenges;

public class Reverse32BitInteger {
    public static void main(String[] args) {
        Reverse32BitInteger reverse32BitInteger = new Reverse32BitInteger();
        System.out.print(reverse32BitInteger.reverse(999999999));
    }

    private int reverse(int x) {
        int num = Math.abs(x);
        int rev = 0;
        while(num != 0) {
            int lastDigit = num % 10; //Get last digit
            //Check overflow
            if(rev > (Integer.MAX_VALUE - lastDigit) / 10)
                return 0;

            rev = rev * 10 + lastDigit;
            num = num / 10; //Remove last digit from num
        }
        //return reverse value with sign
        return (x < 0) ? (-rev) : rev;
    }
}
