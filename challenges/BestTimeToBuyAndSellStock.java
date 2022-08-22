package challenges;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        final int i = maxProfit(prices);
        System.out.println(i);
    }

    public static int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i < prices.length; i++) {
            if(prices[i] < minValue) {
                minValue = prices[i];
            } else if(prices[i] - minValue > maxProfit) {
                maxProfit = prices[i] - minValue;
            }
        }
        return maxProfit;
    }
}