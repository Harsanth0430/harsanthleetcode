// Last updated: 25/02/2026, 11:19:46
class Solution {
    public int countTriples(int n) {
        int count =0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                for(int k=1;k<=n;k++){
                      if((k*k)==(j*j+i*i))
                      {
                        count++;
                      }
                }
            }
            }
            return count;
     }
}