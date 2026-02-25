// Last updated: 25/02/2026, 11:19:48
class Solution {
    public int arraySign(int[] nums) {
        int negativecount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                negativecount++;
            }
            if(nums[i]==0) return 0;
            }
        if(negativecount%2==0) return 1;
        else return -1;

    }
}