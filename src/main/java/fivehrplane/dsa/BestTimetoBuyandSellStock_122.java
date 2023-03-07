package fivehrplane.dsa;

import org.junit.Test;

public class BestTimetoBuyandSellStock_122 {
	
	@Test
	public void example2()
	{
		int[] prices= {2,3,4,5};
		System.out.println(maxProfit(prices));
	}
	
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
