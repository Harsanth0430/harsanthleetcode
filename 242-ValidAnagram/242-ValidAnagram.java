// Last updated: 25/02/2026, 11:20:38
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
       HashMap<Character,Integer>m=new HashMap<>();
       for(char ch:s.toCharArray()){
        m.put(ch,m.getOrDefault(ch,0)+1);
       }
       for(char ch:t.toCharArray()){
        m.put(ch,m.getOrDefault(ch,0)-1);
       }
       for(int x:m.values()){
        if(x!=0) return false;
       }
       return true;
    }
}