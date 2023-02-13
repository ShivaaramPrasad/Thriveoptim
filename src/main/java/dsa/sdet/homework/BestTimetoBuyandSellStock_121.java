package dsa.sdet.homework;

import org.junit.Assert;
import org.junit.Test;

public class BestTimetoBuyandSellStock_121 {
	
	@Test
    public void example1() {
        int[] prices = {7,1,5,3,6,4};
        int output = 5;
        Assert.assertEquals(output, maxProfit(prices));
    }

    @Test
    public void example2() {
        int[] prices = {7,6,4,3,1};
        int output = 0;
        Assert.assertEquals(output, maxProfit(prices));
    }

    /*Approach
     Declare minPrice is price of 0
     Declare profit 
    Traverse each element and find min
    Find profit with max of profit and price-minPrice
    Return profit
     */
    public int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int profit = 0;

        for(int price:prices){
            minPrice = Math.min(minPrice,price);
            profit = Math.max(profit, price-minPrice);
        }
        return profit;
    }
}

