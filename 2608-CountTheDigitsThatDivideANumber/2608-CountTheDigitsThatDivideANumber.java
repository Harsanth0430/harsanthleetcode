// Last updated: 25/02/2026, 11:19:27
class Solution {
    public int countDigits(int num) {
       int count=0;
       int n=num;
       while(num!=0){
        int  d=num%10;
         if(n%d==0){
           count++;
         }
         num/=10;
       }  
       return count;
    }
}