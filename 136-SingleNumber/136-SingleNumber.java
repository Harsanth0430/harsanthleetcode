// Last updated: 25/02/2026, 11:20:49
class Solution {
    public int singleNumber(int[] nums) {
        int len=nums.length;
        int res=nums[0];
        for(int i=0;i<len;i++){
            int count=0;
            for(int j=0;j<len;j++){
            if(nums[i]==nums[j]) count++;
            if(count==2) break;
            }
            if(count==1){
                res=nums[i];
            }
        }
        return res;
    }
}