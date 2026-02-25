// Last updated: 25/02/2026, 11:19:49
class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans=0;
        for(int j=0;j<accounts.length;j++){
            int sum=0;
            for(int k=0;k<accounts[j].length;k++){
                 sum+=accounts[j][k];
            }
            if(sum>=ans){
                ans=sum;
            }
        }
        return ans;
    }
}