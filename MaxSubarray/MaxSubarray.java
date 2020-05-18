package MaxSubarray;

//Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
//
//        Example:
//
//        Input: [-2,1,-3,4,-1,2,1,-5,4],
//        Output: 6
//        Explanation: [4,-1,2,1] has the largest sum = 6.

public class MaxSubarray {
    public static void main(String[] args) {
        int[] nums = {1, -2, 3, 4, -5, 8};

        System.out.println(solve(nums));
    }

    public static int solve(int[] nums) {
        int max_global = nums[0];
        int max_current = nums[0];

        for(int i=1; i<nums.length; i++) {
            //max current will take on the value of the greatest number between
            //
            max_current = Math.max(nums[i], max_current+nums[i]);

            if(max_current>max_global) {
                max_global = max_current;
            }
        }
        return max_global;
    }
}
