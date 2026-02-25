// Last updated: 25/02/2026, 11:20:39
class Solution {
    public boolean isPowerOfTwo(int n) {
    return(n>0 &&((n&(n-1))==0));
    }
}