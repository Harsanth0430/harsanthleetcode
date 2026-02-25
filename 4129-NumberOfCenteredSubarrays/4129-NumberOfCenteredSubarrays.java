// Last updated: 25/02/2026, 11:18:53
class Solution {
    public int centeredSubarrays(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                for(int k=i;k<=j;k++){
                if(sum==nums[k]) {
                    count++;
                    break;
                }
                }
            }
        }
        return count;
    }
}