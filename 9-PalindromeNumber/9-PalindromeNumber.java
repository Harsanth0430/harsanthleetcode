// Last updated: 25/02/2026, 11:20:59
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int rev=0;
        int original=x;
        while(x!=0){
            rev=rev*10+x%10;
            x=x/10;
        }
        if(original==rev) return true;
        else return false;
        
    }
}