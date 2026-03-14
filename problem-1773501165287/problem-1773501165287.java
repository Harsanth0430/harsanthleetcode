// Last updated: 14/03/2026, 20:42:45
1class Solution {
2    public int firstUniqueEven(int[] nums) {
3       for(int i=0;i<nums.length;i++){
4           int count=0;
5          for(int j=0;j<nums.length;j++){
6                 if(( i!=j)&&  nums[i]==nums[j]){
7                     count++;
8                 }
9          }
10              if(nums[i]%2==0 && count==0){
11                  return nums[i];
12                  
13          }   
14       } 
15        return -1;
16    }
17}