public class BestTimeToBuyAndSellStocks {
    public int maxProfit(int[] prices) {
        int m=prices[0];
        int ma=0;
        for(int i : prices){
            m=Math.min(m,i);
            ma=Math.max(ma,i-m);
        }
        return ma;

    }
}
