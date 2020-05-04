package TwoEggs;

public class TwoEggs {

    static int mid = 0;
    static int lastMid = 0;

    public static void main(String[] args) {
        System.out.println(solve(2,10));
    }


    //solve with dynamic programming, where n is number of eggs and m is
    // number of floors
    public static int solve(int n, int m) {
        int steps = 0;
        mid = (m + 1)/2;

        if(n == 1) {
            for(int i = 0; i < m; i++) {
                steps++;
            }
        }
        while(n >= 1) {
            if(drop(mid) && n == 2) {
                n--;
                for(int i = lastMid; i < mid; i++) {
                    if(drop(mid)) {
                        steps++;
                    } else if(!drop(mid)) {
                        return steps;
                    }
                }
            } else if(!drop(mid)) {
                steps++;
                if(mid == (m-1)) {
                    return steps;
                } else {
                    lastMid = mid;
                    mid = (m + mid + 1) / 2;
                }
            } else if(drop(mid) && n > 2) {
                steps++;
                n--;
                mid = (mid + lastMid)/2;
            }

        }



        return steps;
    }

    public static boolean drop(int floorNumber) {

        if(floorNumber == 10) {
            return true;
        }
        else {
            return false;
        }
    }


}
