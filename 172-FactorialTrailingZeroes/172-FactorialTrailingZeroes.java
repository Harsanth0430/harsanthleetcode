// Last updated: 25/02/2026, 11:20:44
class Solution {
    public int trailingZeroes(int n) {
    int count =0;
    while(n>=5){
        count+=n/5;
        n=n/5;
    }
    return count;
    }
}