// Last updated: 25/02/2026, 11:19:03
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int i=x;
        while(i>=1){
            sum+=i%10;
            i/=10;
        }
        if(x%sum==0) return sum;
         i++;
         return -1;
    }
}