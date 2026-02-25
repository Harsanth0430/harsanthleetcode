// Last updated: 25/02/2026, 11:18:48
class Solution {
    public int vowelConsonantScore(String s) {
        int v=0;
        int c=0;
        char a[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u') {
                v++;
            }else if(a[i]>='a'&&a[i]<='z'){
              c++;
            }
        }
        if(c==0||v==0) return 0;
        return (v/c);
    }
}