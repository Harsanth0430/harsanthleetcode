// Last updated: 25/02/2026, 11:20:32
class Solution {
    public int missingNumber(int[] nums) {
    int b=0; 
    int n=nums.length; 
    Arrays.sort(nums);
    for(int i=0;i<n;i++)
    if(i!=nums[i]){
        return b=i;
    }
    return n;
    }
}