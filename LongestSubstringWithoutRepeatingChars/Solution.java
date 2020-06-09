package LongestSubstringWithoutRepeatingChars;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int currentLength = 0;
        int totalLength = 0;

        for (int i = 0; i < s.length(); map.put(s.charAt(i), i), i++) {
            if (map.containsKey(s.charAt(i)) && totalLength < currentLength) {
                totalLength = currentLength;
                currentLength = 0;
            }
            currentLength++;
        }
        return totalLength;
    }
}
