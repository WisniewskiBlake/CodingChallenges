package RomanToInt;

public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }

    public static int romanToInt(String s) {
        int number = 0;
        //cycle through string with .charAt(i) in reverse
        for (int i = s.length() - 1; i > -1; i--) {
            if(i == s.length()) {
                if(s.charAt(i) == 'M') {
                    number += 1000;
                }
                else if(s.charAt(i) == 'D') {
                    number += 500;
                }
                else if(s.charAt(i) == 'C') {
                    number += 100;
                }
                else if(s.charAt(i) == 'L') {
                    number += 50;
                }
                else if(s.charAt(i) == 'X') {
                    number += 10;
                }
                else if(s.charAt(i) == 'V') {
                    number += 5;
                }
                else if(s.charAt(i) == 'I') {
                    number += 1;
                } else {
                    return 0;
                }
            } else {
                if(s.charAt(i) == 'M') {
                    number += 1000;
                }
                else if(s.charAt(i) == 'D') {
                    number += 500;
                }
                else if(s.charAt(i) == 'C') {
                    number += 100;
                }
                else if(s.charAt(i) == 'L') {
                    number += 50;
                }
                else if(s.charAt(i) == 'X') {
                    number += 10;
                }
                else if(s.charAt(i) == 'V') {
                    number += 5;
                }
                else if(s.charAt(i) == 'I') {
                    number += 1;
                } else {
                    return 0;
                }
            }

        }
        return number;
    }
}
