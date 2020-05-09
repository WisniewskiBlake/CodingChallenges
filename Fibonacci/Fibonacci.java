package Fibonacci;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(memoizeFibonacci(10));
    }

    public static int bruteForceFibonacci(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        return bruteForceFibonacci(n-1) + bruteForceFibonacci(n-2);
    }

    public static int memoizeFibonacci(int n) {
        Map<Integer,Integer> memoizeTable = new HashMap<>();
        memoizeTable.put(0, 0);
        memoizeTable.put(1, 1);

        if(memoizeTable.containsKey(n)) {
            return memoizeTable.get(n);
        }

        memoizeTable.put(n-1, memoizeFibonacci(n-1));
        memoizeTable.put(n-2, memoizeFibonacci(n-2));

        int calculatedNumber = memoizeTable.get(n-1) + memoizeTable.get(n-2);

        return calculatedNumber;

    }

    public static int withoutMapFibonacci(int n) {
        if(n == 0) {
            return 0;
        }
        else if(n == 1) {
            return 1;
        }

        int[] memo = new int[n];
        memo[0] = 0;
        memo[1] = 1;
        for(int i = 2; i < n; i++) {
            memo[i] = memo[i - 1] + memo[i-2];
        }

    }

}
