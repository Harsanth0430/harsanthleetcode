// Last updated: 25/02/2026, 11:20:30
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
                if(nums[i]==nums[i+1]){
                     return nums[i];
                }
        }
        return -1;
    }
}