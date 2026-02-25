// Last updated: 25/02/2026, 11:20:53
class Solution {
    public int maxProfit(int[] prices) {
        int buyprice=prices[0];
        int maxp=0;
        for(int i=1;i<prices.length;i++){
            int sellprice=prices[i];
            if(sellprice>buyprice){
                int profit=sellprice-buyprice;
                if(maxp<profit)
                maxp=profit;
            }
            else{
                buyprice=prices[i];
            }
        }
        return maxp;
    }
}