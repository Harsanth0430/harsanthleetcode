// Last updated: 25/02/2026, 11:18:54
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
             sum+=nums[i];
        }
       int ans=sum%k;
       return ans;
    }
}