package Day1;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int min_stock=prices[0];
        int profit=0;
        int cost=0;
        for(int i=1;i<prices.length;i++){
            min_stock=Math.min(prices[i],min_stock);
            cost=prices[i]-min_stock;
            profit=Math.max(profit,cost);
        }
        return profit;
        
    }
}
