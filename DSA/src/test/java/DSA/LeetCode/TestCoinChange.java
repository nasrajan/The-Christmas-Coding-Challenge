package DSA.LeetCode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestCoinChange {

    static CoinChange coinChange;
    @BeforeAll
    static void setup() {
        coinChange = new CoinChange();
    }
    @Test
    public void testaBunchofCoins() {
        var coins = new int[] {1, 2, 5};
        var amount = 11;
        var change = coinChange.coinChange(coins, amount);
        assertEquals(3, change);
    }
    @Test
    public void testAmountMoreThanCoins() {
        var coins = new int[] {2};
        var amount = 3;
        var change = coinChange.coinChange(coins, amount);
        assertEquals(-1, change);
    }

    @Test
    public void testAmountZero() {
        var coins = new int[] {2};
        var amount = 0;
        var change = coinChange.coinChange(coins, amount);
        assertEquals(0, change);
    }

}
