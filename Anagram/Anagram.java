package Anagram;

import java.util.HashMap;

public class Anagram {

    public static void main(String[] args) {
        char[] word1 = {'r','e','s','t','f','u','l'};
        char[] word2 = {'f','l','u','s','t','e','r'};

        System.out.println(solve(word1, word2));
    }

    public static String solve(char[] word1, char[] word2) {
        HashMap<Character,Integer> map = new HashMap<>();

        if(word1.length != word2.length) {
            return "Not an anagram";
        }else {
            for(int i = 0; i < word2.length; i++) {
                map.put(word2[i], i);
            }
            for(int i = 0; i < word1.length; i++) {
                if(!map.containsKey(word1[i])) {
                    return "Not an anagram";
                }

            }
        }
        return "Words an anagram";
    }

}
