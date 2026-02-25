// Last updated: 25/02/2026, 11:18:49

class Solution {
    int mirrorDistance(int n) {
      int rev=0;
      int b=n;
      while(n!=0){
          rev=rev*10+n%10;
          n/=10;
      }  
      int a=Math.abs(b-rev);
      return a;
    }
};