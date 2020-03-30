package CodingChallenges.Challenge1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * C1Solution
 */
public class C1Solution {

    public static void main(String[] args) {
        
        int[] array = {1, 3, 6, 4, 1, 2};
        int min = Integer.MAX_VALUE;
        HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();

        int smallestMissing = Integer.MIN_VALUE;
        
        
        for(int i = 0; i < array.length; i++){
            hashMap.put(i, array[i]);
        }

        for (Map.Entry<Integer,Integer> entry : hashMap.entrySet()) {        
            int current = entry.getValue();
            if(!hashMap.containsValue(current - 1) && current - 1 > 0 && smallestMissing < min){
                smallestMissing = current - 1;
            }
        }

        System.out.println(smallestMissing);

    }























}