package org.example.bestTimeToBuyAndSellStock;

public class main {
    public static void main(String[] args) {
        int[] prices = {2,4,1};


        System.out.println(bestProfit(prices));
        //System.out.println(bestDayForProfit(prices));

    }
    public static int bestProfit(int[] prices){
        int lowerPrice = Integer.MAX_VALUE; // lower price
        int profit = 0; //  profit
        int pist = 0; // profit if sold today (one day profit)

        for(int i = 0; i < prices.length; i++) {
            if (prices[i] < lowerPrice) { // looking for smaller price
                lowerPrice = prices[i];
            }
            pist = prices[i] - lowerPrice; // calculating profit if sold today by, Buy - sell
            if (profit < pist) { // if pist is more then our previous  profit
                profit = pist; // update  profit
            }
        }
        return profit;
    }
    public static int bestDayForProfit (int[] prices){// do not work with {2,4,1}
        int day = 0;
        int lowerPrice = prices[0];
            //checking our days for lower price
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < lowerPrice){
                lowerPrice = prices[i];//set our lower price
                day = i;//set our day(index) when was lower price
            }
        }
        if (day != prices.length-1){ //checking if my lowest price wasnt on last day
            //set maxPrice after my lower price day
            int maxPrice = prices[day+1];

            for (int i = day; i < prices.length; i++) {
                if(prices[i] > maxPrice){
                    maxPrice = prices[i];
                }
            }
                return maxPrice-lowerPrice;

        }else {
            return 0;
        }

    }
}
/*
Question-1 Best Time to Buy and Sell Stock
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0. Example 1:


Input: prices = [7,1,5,3,6,4] Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.


Example 2:
Input: prices = [7,6,4,3,1] Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.


Constraints:
1 <= prices.length <= 105 0 <= prices[i] <= 104
 */
