// Last updated: 25/02/2026, 11:20:41
class Solution {
    public static int sumofSquare(int n){
        int d=0;
        int sum=0;
        while(n!=0){
            d=n%10;
            sum+=d*d;
            n/=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do{
            slow=sumofSquare(slow);
            fast=sumofSquare(sumofSquare(fast));
        }
        while(slow!=fast);
         return slow==1?true:false;
        }
    }
