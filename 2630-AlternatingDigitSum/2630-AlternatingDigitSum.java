// Last updated: 25/02/2026, 11:19:25
class Solution {
    public int alternateDigitSum(int n) {
        String s=String.valueOf(n);
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                sum+=s.charAt(i)-48;
            }
            else {
                sum-=s.charAt(i)-48;
            }
        }
            return sum;
        } 
}