package Fibonacci;

public class Fibonacci {

    public int bruteForceFibonacci(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        return bruteForceFibonacci(n-1) + bruteForceFibonacci(n-2);
    }

}
