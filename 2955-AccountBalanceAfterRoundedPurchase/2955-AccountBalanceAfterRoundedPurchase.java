// Last updated: 25/02/2026, 11:19:08
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        if(purchaseAmount%10<=4){
            return 100-(purchaseAmount/10)*10;
        }
        else{
             return 100-((purchaseAmount/10)+1)*10;
        }
        }
    }