// Last updated: 25/02/2026, 11:19:26
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int digitsum=0;
        int difference=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(nums[i]!=0){
                digitsum+=nums[i]%10;
                nums[i]/=10;
            }
        }
        difference=sum-digitsum;
        return difference;
    }
}