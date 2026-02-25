// Last updated: 25/02/2026, 11:19:29
class Solution {
    public int numberOfCuts(int n) {
        if(n==1) return 0;
        if(n%2==0) return n/2;
        else return n;
        
    }
}