// Last updated: 25/02/2026, 11:19:30
class Solution {
    public int pivotInteger(int n) {
        for(int x=1;x<=n;x++){
            int rightsum=0;
            int leftsum=0;
            for(int i=1;i<=x;i++){
                leftsum+=i;
            }
            for(int j=x;j<=n;j++){
                rightsum+=j;
            }
            if(leftsum==rightsum) return x;
        }
        return -1;

        }
        
    }