// Last updated: 25/02/2026, 11:20:47
class Solution {
    public String convertToTitle(int n) {
        StringBuffer ans=new StringBuffer();
        while(n>0){
            n--;
            ans.append((char)((n%26)+65));
            n/=26;
        }
        return ans.reverse().toString();
    }
}