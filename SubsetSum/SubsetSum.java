package SubsetSum;

import java.util.HashMap;

public class SubsetSum {

    public static void main(String[] args) {
        int[] set = {3, 2, 5, 3};
        int sum = 6;
        int[] solved = solve(set, sum);
        for(int i = 0; i < 2; i++) {
            System.out.println(solved[i]);
        }

    }

    public static int[] solve(int[] set, int sum) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] solutionArray = new int[2];

        for(int i = 0; i < set.length; i++) {
            int num1 = set[i];
            int num2 = sum - set[i];

            if(map.containsKey(num2)) {
                solutionArray[0] = map.get(num2);
                solutionArray[1] = i;
                return solutionArray;
            }

            map.put(num1, i);

        }
        return solutionArray;
    }

}
