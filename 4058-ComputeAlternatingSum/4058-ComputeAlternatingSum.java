// Last updated: 25/02/2026, 11:18:51
class Solution {
    public int alternatingSum(int[] nums) {
       int evensum=0;
       int oddsum=0;
       for(int i=0;i<nums.length;i++){
        if(i%2==0){
            evensum+=nums[i];
        }
        else{
            oddsum+=nums[i];
        }
       } 
       int ans=evensum-oddsum;
       return ans;
    }
}