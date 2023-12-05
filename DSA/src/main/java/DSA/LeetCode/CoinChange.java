package DSA.LeetCode;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        if(amount < 1) return 0;

        return coinChange(coins, amount, new int[amount]);
    }

    int coinChange(int[] coins, int amount, int[] dp) {

        if(amount < 0) return -1;
        if(amount == 0) return 0;
        if(dp[amount-1] !=0) return dp[amount-1];
        int minchange = Integer.MAX_VALUE;

        for(int i=0; i < coins.length; i++) {
            int change = coinChange(coins, amount-coins[i], dp);
            if(change >= 0)
                minchange = Math.min(1 + change, minchange);

        }
        dp[amount-1] = (minchange == Integer.MAX_VALUE) ? -1 : minchange;
        return dp[amount-1];
    }
}
