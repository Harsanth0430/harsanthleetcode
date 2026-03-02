// Last updated: 02/03/2026, 21:07:28
1class Solution {
2    public int scoreOfString(String s) {
3        int result=0;
4        char a[]=s.toCharArray();
5        for(int i=0;i<a.length-1;i++){
6             result +=Math.abs(a[i]-a[i+1]);
7        }
8        return result;
9    }
10}