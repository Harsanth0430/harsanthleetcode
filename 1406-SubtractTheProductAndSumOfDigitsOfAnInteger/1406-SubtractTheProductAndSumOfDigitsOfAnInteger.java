// Last updated: 25/02/2026, 11:19:58
class Solution {
    public int subtractProductAndSum(int n) {
        int diffsum=1;
        int sumdigit=0;
        int diff=0;
        while(n!=0){
            diffsum*=n%10;
            sumdigit+=n%10;
            n/=10;
        }
        return diff=diffsum-sumdigit;
    }
}