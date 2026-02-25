// Last updated: 25/02/2026, 11:20:20
class Solution {
    public int arrangeCoins(int n) {
        int count =0;
        int row =1;
        while (n>=row){
            n-=row; 
            count++;
            row++;
        }
        return count;
    }
}