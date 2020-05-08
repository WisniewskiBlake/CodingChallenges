package Fibonacci;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(bruteForceFibonacci(4));
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

}
