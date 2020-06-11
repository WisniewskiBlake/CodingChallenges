package LongestSubstringWithoutRepeatingChars;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        //System.out.println(lengthOfLongestSubstring("dvxdf"));
        //System.out.println(lengthOfLongestSubstring("aabaabbb"));
        System.out.println(lengthOfLongestSubstring("dvxdf"));
        //System.out.println(lengthOfLongestSubstring("yfsrsrpzuya"));

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
                    //if the position of the previous "y" is less than the
                    // current position of "y" - currentLength, then carry on
                    if(map.get(s.charAt(i)) < (i - currentLength)) {

                    }
                    else if(i < s.length()-1 && !map.containsKey(s.charAt(i+1))) {
                        currentLength = (i-1)-(map.get(s.charAt(i)));
                    }
                    else if(i < s.length()-1 && !(s.charAt(i+1) == s.charAt(i-1))) {
                        currentLength = (i-1)-(map.get(s.charAt(i)));
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
