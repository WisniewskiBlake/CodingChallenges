package TwoEggs;

public class TwoEggs {
    public static void main(String[] args) {

    }

    //solve with dynamic programming, where n is number of eggs and m is
    // number of floors
    public static void solve(int n, int m) {
        int lastMid;
        int mid = m/2;

        while(n >= 1) {


        }

    }

    public static boolean drop(int floorNumber) {
        int chance = (int) Math.random() * 10;
        if(chance <= 5) {
            return false;
        }
        else {
            return true;
        }
    }
}
