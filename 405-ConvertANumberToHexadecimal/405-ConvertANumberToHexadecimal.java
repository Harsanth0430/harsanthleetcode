// Last updated: 25/02/2026, 11:20:23
class Solution {
    public String toHex(int num) {
        if(num==0) return"0";
        StringBuffer sb=new StringBuffer();
        char[]array="0123456789abcdef".toCharArray();
      while(num!=0){
        int digit=(num&15);
        sb.append(array[digit]);
        num>>>=4;
      }
     return sb.reverse().toString();
    }
}