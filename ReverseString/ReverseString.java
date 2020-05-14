package ReverseString;

public class ReverseString {
    public static void main(String[] args) {
        char[] input = {'h', 'e', 'l', 'l', 'e', 'e', 'e', 'h'};
        solve(input);


    }

    public static void solve(char[] stringArray) {
        int size = stringArray.length - 1;
        for (int i = 0; i < stringArray.length/2; i++) {
            char temp = stringArray[i];
            stringArray[i] = stringArray[size];
            stringArray[size] = temp;
            size--;
        }
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }

    public static void helper(char[] s, int left, int right) {
        if (left >= right) return;
        char tmp = s[left];
        s[left++] = s[right];
        s[right--] = tmp;
        helper(s, left, right);
    }

    public static void reverseString(char[] s) {
        helper(s, 0, s.length - 1);
    }
}
