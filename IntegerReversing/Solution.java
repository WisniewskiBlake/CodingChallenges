package IntegerReversing;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        System.out.println(reverseNoConversion(1234));
    }

    public static int reverse(int number) {

        String reversed = "";

        int digit;
//        int newNumber;

        while(number > 0) {
            digit = number % 10;
            number = number / 10;
            reversed += digit;
        }
        return Integer.parseInt(reversed);
    }

    public static int reverseNoConversion(int number) {

        int reversed = 0;
        int digit;

        while(number > 0) {
            digit = number % 10;
            number = number / 10;
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }


}
