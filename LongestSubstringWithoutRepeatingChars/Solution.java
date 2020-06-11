package LongestSubstringWithoutRepeatingChars;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        //System.out.println(lengthOfLongestSubstring("dvxdf"));
        //System.out.println(lengthOfLongestSubstring("aabaabbb"));
        System.out.println(lengthOfLongestSubstring1("dvxdf"));
        //System.out.println(lengthOfLongestSubstring("fbojelwjgercer"));

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
            for (int i = 0; i < s.length(); map.put(s.charAt(i), i),
                i++) {
                if (map.containsKey(s.charAt(i)) && totalLength <= currentLength) {

                    if(!(map.get(s.charAt(i)) < (i - currentLength))) {
                        if(i < s.length()-1 && !(s.charAt(i+1) == s.charAt(i-1))) {
                            currentLength = (i-1)-(map.get(s.charAt(i)));
                        }
//                        else if(i < s.length() - 1 && map.get(s.charAt(i)) >= currentLength) {
//                            currentLength = (i-1)-(map.get(s.charAt(i)));
//                        }
                        else {
                            totalLength = currentLength;
                            currentLength = 0;
                        }
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

    public static int lengthOfLongestSubstring1(String s) {
        int totalLength = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < s.length(); j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            totalLength = Math.max(totalLength, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return totalLength;
    }
}
