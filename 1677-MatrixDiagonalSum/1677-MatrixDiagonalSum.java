// Last updated: 25/02/2026, 11:19:51
class Solution {
    public int diagonalSum(int[][] mat) {
        int secsum=mat.length;
        int sum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if((i==j)||(i+j==secsum-1)){
                  sum+=mat[i][j];
                }
            }
        }
        return sum;
    }
}