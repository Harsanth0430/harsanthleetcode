// Last updated: 12/03/2026, 22:06:11
1class Solution {
2    public void sortColors(int[] nums) {
3       for(int i=0;i<nums.length;i++){
4        for(int j=0;j<nums.length-1;j++){
5        if(nums[j]>nums[i]){
6            int temp=nums[i];
7           nums[i]=nums[j];
8           nums[j]=temp;
9        }
10    }
11    }
12    return ;
13}
14}