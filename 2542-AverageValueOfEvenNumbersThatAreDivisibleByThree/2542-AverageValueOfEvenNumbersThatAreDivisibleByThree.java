// Last updated: 25/02/2026, 11:19:34
class Solution {
    public int averageValue(int[] nums) {
        int count=0;
        int sum=0;
        int avg=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]%2==0) &&(nums[i]%3==0)){
                count++;
                sum+=nums[i];
            }
        }
        if(count==0) return 0;
        else return avg=sum/count;
    }
}