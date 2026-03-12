// Last updated: 12/03/2026, 22:13:15
1class Solution {
2    public void sortColors(int[] nums) {
3       for(int i=0;i<nums.length;i++){
4        for(int j=0;j<nums.length-1;j++){
5        if(nums[j]>nums[j+1]){
6            int temp=nums[j+1];
7           nums[j+1]=nums[j];
8           nums[j]=temp;
9        }
10    }
11    }
12    return ;
13}
14}