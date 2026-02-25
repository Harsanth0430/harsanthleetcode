// Last updated: 25/02/2026, 11:18:59
class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum=0;
        int dd =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                sum+=nums[i];
            }
            else{
                dd+=nums[i];
            }
        }
            return sum!=dd;
        
    }
}