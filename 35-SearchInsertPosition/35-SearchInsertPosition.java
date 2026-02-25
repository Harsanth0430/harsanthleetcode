// Last updated: 25/02/2026, 11:20:55
class Solution {
    public int searchInsert(int[] nums, int target) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<target){
                c=i+1;
            }
            if(nums[i]==target){
                return i;
            }
        }
          return c;
    }
}