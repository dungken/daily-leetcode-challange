package _top_interview_150;

public class _121_Best_Time_Buy_Sell_Stock {

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int maxTemp = 0;
            for (int j = i + 1; j < prices.length; j++) {
                int dis = prices[j] - prices[i];
                if(prices[i] < prices[j] && (dis > maxProfit)) {
                    maxTemp = dis;
                    maxProfit = maxTemp;
                }
            }
        }
        return maxProfit;
    }

    public static int maxProfit2(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for(int i = 1; i < prices.length; i++) {
             if(prices[i] < buy) {
                 buy = prices[i];
             } else if(prices[i] - buy > profit) {
                 profit = prices[i] - buy;
             }
        }
        return profit;
    }

    public static int maxProfit3(int[] prices) {
        int left = 0; // Buy
        int right = 1; // sell
        int max_profit = 0;
        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                int profit = prices[right] - prices[left]; // our current profit

                max_profit = Math.max(max_profit, profit);
            } else {
                left = right;
            }
            right++;
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit2(arr));
    }
}
