// Last updated: 25/02/2026, 11:18:50
class Solution {
    public int residuePrefixes(String s) {
        HashSet<Character>a=new HashSet<>();
        int ans =0;
        for(int i=0;i<s.length();i++){
            a.add(s.charAt(i));
            int distinct=a.size();
            int len=(i+1)%3;
            if(distinct==len){
                ans++;
            }
        }
        return ans;
    }
}