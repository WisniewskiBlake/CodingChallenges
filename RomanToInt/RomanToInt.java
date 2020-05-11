package RomanToInt;

import com.sun.source.tree.BlockTree;
import com.sun.source.tree.StatementTree;
import com.sun.source.tree.TreeVisitor;

import java.util.HashMap;
import java.util.List;

public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
    }

    public static int romanToInt(String s) {
        //assign symbol hierarchy
        //if a symbol appears AFTER a larger(or equal) symbol it is added
        // (from left > right, if i+1 is greater or equal, then add it. else
        // subtract)
        //if a symbol appears BEFORE a larger symbol it is subtracted
        int number = 0;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);
        //check if input is single char
        if(s.length() == 1) {
            return map.get(s.charAt(0));
        }
        //need to check if i-1 is higher, lower, or equal
        for (int i = 1; i < s.length(); i++) {
            if(i == s.length()-1) {
                number += map.get(s.charAt(i));
            }
            if(map.get(s.charAt(i-1)) >= map.get(s.charAt(i))) {
                number += map.get(s.charAt(i-1));
            }
            else if(map.get(s.charAt(i-1)) < map.get(s.charAt(i))) {
                number -= map.get(s.charAt(i-1));
            }

        }

        return number;
    }
}
