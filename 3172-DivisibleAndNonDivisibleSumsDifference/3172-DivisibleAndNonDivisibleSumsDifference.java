// Last updated: 25/02/2026, 11:19:07
class Solution {
    public int differenceOfSums(int n, int m) {
        int num2=0;
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                num2+=i;
            }
            else {
                sum+=i;
            }
        }
        return sum-num2;
    }
}