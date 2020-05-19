package BuyAndSellStock;

//Say you have an array for which the ith element is the price of a given stock on day i.
//
//        If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
//
//        Note that you cannot sell a stock before you buy one.
//
//        Example 1:
//
//        Input: [7,1,5,3,6,4]
//        Output: 5
//        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//        Not 7-1 = 6, as selling price needs to be larger than buying price.
//        Example 2:
//
//        Input: [7,6,4,3,1]
//        Output: 0
//        Explanation: In this case, no transaction is done, i.e. max profit = 0.

//How to solve:
//we want to buy on the lowest price each day, we cant buy on the last
// element, and we need to buy before we sell.
//
//We want to keep track a running minimum then the maximum value after the
// minimum
//
//We can identify the first minimum by finding the first increasing substring
//We can identify the corresponding maximum to the final minmum by finding
// the largest value after the final minimum

import java.util.HashMap;

import static java.lang.Integer.MAX_VALUE;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] inputArray = {3,2,6,5,0,3};
        System.out.println(solve(inputArray));
    }

    public static int solve(int[] prices) {
        int possibleMinimum = Integer.MAX_VALUE;
        int finalMinimum = Integer.MAX_VALUE;
        int finalMaximum = Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < prices.length-1; i++) {
            if(prices[i] < prices[i+1]) {
                possibleMinimum = prices[i];
            }
            if(possibleMinimum < finalMinimum) {
                finalMinimum = possibleMinimum;
                map.put(finalMinimum,i);
            }
        }
        if(!map.isEmpty()) {
            for (int i = map.get(finalMinimum); i < prices.length - 1; i++) {
                if(prices[i] < prices[i+1]) {
                    finalMaximum = prices[i+1];
                }

            }
            return finalMaximum - finalMinimum;
        }

        return 0;
    }












//    public static int solveWithMap(int[] prices) {
//        int minimum = MAX_VALUE;
//
//    }















}
