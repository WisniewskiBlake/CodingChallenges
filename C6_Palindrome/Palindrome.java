package C6_Palindrome;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome3("Hello"));
    }

    public static boolean palindrome1(String s) {
        String reversed = "";
        int length = s.length();

        for(int i = length - 1; i >= 0; i--) {
            reversed = reversed + s.charAt(i);
        }

        if(s.equals(reversed)) {
            return true;
        }
        return false;
    }

    public static boolean palindrome2(String s) {
        int i = 0;
        int j = s.length()-1;
        int k = (i+j)/2;

        for(int index = i; index <= k; index++) {
            if(s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean palindrome3(String s) {
        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }
}