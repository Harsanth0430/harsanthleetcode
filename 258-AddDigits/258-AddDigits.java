// Last updated: 25/02/2026, 11:20:36
class Solution {
    public int addDigits(int num) {
        if(num==0) return 0;
         return num%9==0?9:num%9;
        }    
    }