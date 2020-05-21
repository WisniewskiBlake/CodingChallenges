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
//identify first minimum value, add it to the map, map.put(minimum, maximum),
// then
// keep going
// through array
// keeping track of max. If larger max is found, map.replace(minimum,
// newMaximum). keep going until a smaller minimum is found. once a smaller minimum isfound then add it to the hashmap with the next maximum value found
//

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] inputArray = {7,6,4,3,1};
        System.out.println(solveWithMap(inputArray));
    }

//    public static int solve(int[] prices) {
//        int currentMin = Integer.MAX_VALUE;
//        int finalMinimum = Integer.MAX_VALUE;
//        int currentMax = Integer.MAX_VALUE;
//        int finalMax = Integer.MIN_VALUE;
//        int difference = 0;
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < prices.length-1; i++) {
//
//            //check for minimums
//            if(prices[i] < prices[i+1]) {
//                currentMax = prices[i+1];
//                map.put(prices[i+1] - prices[i] ,prices[i+1]);
//
//                if(currentMax > finalMax) {
//                    map.replace(difference, );
//                    finalMax = currentMax;
//                }
//                difference = prices[i+1] - prices[i];
//
//
//            }
//
//        }
//        if(!map.isEmpty()) {
//            for (int i = map.get(finalMinimum); i < prices.length - 1; i++) {
//                if(prices[i] < prices[i+1]) {
//                    finalMaximum = prices[i+1];
//                }
//
//            }
//            return finalMaximum - finalMinimum;
//        }
//
//        return 0;
//    }












    public static int solveWithMap(int[] prices) {
        int minPrice = MAX_VALUE;
        int maxProfit = 0;
        int maxPrice = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
            }
            if(prices[i] - minPrice >= maxProfit) {
                maxProfit = prices[i] - minPrice;
                maxPrice = 0;
                //maybe put this before upper if
                //either comment out max price or move this up
            }
        }
        return maxProfit;
    }















}
