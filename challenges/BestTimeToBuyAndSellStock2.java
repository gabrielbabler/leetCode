package challenges;

public class BestTimeToBuyAndSellStock2 {

    public static int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i < prices.length - 1; i++) {
            if(prices[i] < prices[i+1]) {
                minValue = prices[i];
                maxProfit += prices[i+1] - minValue;
            }
        }
        return maxProfit;
    }
}