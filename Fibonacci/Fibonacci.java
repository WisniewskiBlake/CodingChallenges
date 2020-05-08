package Fibonacci;

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

    public static int memoizeFibonacci() {
        Map<Integer,Integer> memoizeTable;
    }

}
