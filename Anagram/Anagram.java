package Anagram;

import java.util.HashMap;

public class Anagram {

    public static void main(String[] args) {
        char[] word1 = {'r','e','s','t','f','u','l'};
        char[] word2 = {'f','l','u','s','t','e','r'};

        System.out.println(solve(word1, word2));
    }

    public static String solve(char[] word1, char[] word2) {
        HashMap<Integer,Integer> map = new HashMap<>();

        if(word1.length != word2.length) {
            return "Not an anagram";
        }else {

        }
        return "Not an anagram";
    }

}
