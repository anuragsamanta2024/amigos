package leetcode;

public class Stocks {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int profit = profit(prices);
        System.out.println(profit);
    }

    private static int profit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for (int price : prices) {
            if (price < min) {
                min = price;
            }
            profit = Math.max(profit, price - min);
        }
        return profit;

    }
}
