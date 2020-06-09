package SubsetSum;

import java.util.HashMap;

//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//        Example:
//
//        Given nums = [2, 7, 11, 15], target = 9,
//
//        Because nums[0] + nums[1] = 2 + 7 = 9,
//        return [0, 1].

//O(n) time
public class SubsetSum {
    public static void main(String[] args) {
        int[] set = {3, 2, 5, 3};
        int sum = 6;
        int[] solved = solve(set, sum);
        for(int i = 0; i < 2; i++) {
            System.out.println(solved[i]);
        }

    }

        public static int[] solve(int[] nums, int target) {
            int[] twoAddends;


        }







//    public static int[] solve(int[] set, int sum) {
//        HashMap<Integer,Integer> map = new HashMap<>();
//        int[] solutionArray = new int[2];
//
//        for(int i = 0; i < set.length; map.put(set[i], i), i++) {
//            if(map.containsKey(sum - set[i])) {
//                return new 