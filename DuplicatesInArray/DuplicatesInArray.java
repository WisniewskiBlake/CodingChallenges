package DuplicatesInArray;

import java.util.HashMap;

public class DuplicatesInArray {

    public static void main(String[] args) {
        int[] array = {4,7,6,7,5,1,2,3,9,2};
        solve(array);
    }

    public static void solve(int[] array){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < array.length; i++) {

            if(map.containsKey(array[i])) {
                System.out.println(array[i]);
            } else {
                map.put(array[i], i);
            }

        }



    }

}
