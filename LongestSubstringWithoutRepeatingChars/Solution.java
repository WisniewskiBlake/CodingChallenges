package LongestSubstringWithoutRepeatingChars;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        //System.out.println(lengthOfLongestSubstring("dvxdf"));
        //System.out.println(lengthOfLongestSubstring("pwwkew"));
        //System.out.println(lengthOfLongestSubstring("pwwwww"));
        System.out.println(lengthOfLongestSubstring("aabaab!bb"));

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
                    if(!(map.get(s.charAt(i)) < (i - currentLength))) {
                        totalLength = currentLength;
                        currentLength = 0;
                    }

                    if(i < s.length()-1 && !map.containsKey(s.charAt(i+1))) {
                        currentLength = (i-1)-(map.get(s.charAt(i)));
                    }
                    else if(i < s.length()-1 && !(s.charAt(i+1) == s.charAt(i-1))) {
                        currentLength = 1;
                    }
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
