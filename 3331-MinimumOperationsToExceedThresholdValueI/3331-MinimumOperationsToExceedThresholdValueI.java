// Last updated: 25/02/2026, 11:19:05
class Solution {
    public int minOperations(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<k){
                count++;
            }
        }
        return count;
    }
}