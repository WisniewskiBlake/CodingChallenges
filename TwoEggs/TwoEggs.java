package TwoEggs;

public class TwoEggs {

    static int mid = 0;
    static int lastMid = 0;

    public static void main(String[] args) {
        System.out.println(solve(2,100));


        int n = 2, k = 100;
        System.out.println("Minimum number of trials in worst case with "+n+"  eggs and "+k+
                " floors is "+eggDrop(n, k));
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

        if(floorNumber == 100) {
            return true;
        }
        else {
            return false;
        }
    }

    // A utility function to get maximum of two integers
    static int max(int a, int b) { return (a > b)? a: b; }

    /* Function to get minimum number of trials needed in worst
    case with n eggs and k floors */
    static int eggDrop(int n, int k)
    {
       /* A 2D table where entery eggFloor[i][j] will represent minimum
       number of trials needed for i eggs and j floors. */
        int eggFloor[][] = new int[n+1][k+1];
        int res;
        int i, j, x;

        // We need one trial for one floor and0 trials for 0 floors
        for (i = 1; i <= n; i++)
        {
            eggFloor[i][1] = 1;
            eggFloor[i][0] = 0;
        }

        // We always need j trials for one egg and j floors.
        for (j = 1; j <= k; j++)
            eggFloor[1][j] = j;

        // Fill rest of the entries in table using optimal substructure
        // property
        for (i = 2; i <= n; i++)
        {
            for (j = 2; j <= k; j++)
            {
                eggFloor[i][j] = Integer.MAX_VALUE;
                for (x = 1; x <= j; x++)
                {
                    res = 1 + max(eggFloor[i-1][x-1], eggFloor[i][j-x]);
                    if (res < eggFloor[i][j])
                        eggFloor[i][j] = res;
                }
            }
        }

        // eggFloor[n][k] holds the result
        return eggFloor[n][k];

    }


}
