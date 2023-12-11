package DSA.LeetCode;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minVal = Integer.MIN_VALUE;

        for(int i=0; i<prices.length; i++) {
            minVal = Math.min(minVal, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i]);
        }

        return maxProfit;
    }
}
