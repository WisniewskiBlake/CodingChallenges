package TwoEggs;

public class TwoEggs {
    public static void main(String[] args) {
        System.out.println(5/2);
    }

    //solve with dynamic programming, where n is number of eggs and m is
    // number of floors
    public static int solve(int n, int m) {
        int steps = 0;
        int lastMid;
        int mid = (m + 1)/2;

        if(n == 1) {

        }
            while(n >= 1) {
                if(n == 1) {

                } else if(drop(mid) && mid != (m-1)) {
                    steps++;
                    lastMid = mid;
                    mid = (m + mid + 1) / 2;

                } else if(!drop(mid) && n == 1) {

                } else if(!drop(mid) && n == 1) {

                }

            }



        return steps;
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
