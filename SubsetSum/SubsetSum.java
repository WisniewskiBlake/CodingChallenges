package SubsetSum;

import java.util.HashMap;

public class SubsetSum {

    public static void main(String[] args) {
        int[] set = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        System.out.println(solve(set, sum));
    }

    public static String solve(int[] set, int sum) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < set.length; i++) {
            int num1 = set[i];
            int num2 = sum - set[i];

            map.put(num1, i);

            if(map.containsKey(num2)) {
                return "Numbers are " + num1 + " and " + num2;
            }
        }
        return "No Solution";
    }

}
