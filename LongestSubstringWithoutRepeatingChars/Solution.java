package LongestSubstringWithoutRepeatingChars;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int currentLength = 0;
        int totalLength = 0;
        if(s.length() == 0) {
            return 0;
        }
        else if(s.length() == 1) {
            return 1;
        }
        else {
            for (int i = 0; i < s.length(); map.put(s.charAt(i), i), i++) {
                if (map.containsKey(s.charAt(i)) && totalLength <= currentLength) {
                    totalLength = currentLength;
                    currentLength = 0;
                }
                currentLength++;
            }
            if(totalLength == 0) {
                return currentLength;
            }
            if(totalLength < currentLength) {
                return currentLength;
            }
            else {
                return totalLength;
            }

        }
    }
}
