// Last updated: 25/02/2026, 11:20:51
class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int one=0;
        int two=0;
        int zero=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0) zero++;
            if(nums[i]==1) one++;
            if(nums[i]==2) two++;
        }
        int index=0;
        for(int i=0;i<zero;i++) nums[index++]=0;
        for(int i=0;i<one;i++) nums[index++]=1;
        for(int i=0;i<two;i++) nums[index++]=2;
    }
}