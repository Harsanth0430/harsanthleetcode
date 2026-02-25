// Last updated: 25/02/2026, 11:20:06
class Solution {
    public int repeatedNTimes(int[] nums) {
       HashSet<Integer>m=new HashSet<>();
       for(int i=0;i<nums.length;i++){
       if(m.contains(nums[i])) 
       return nums[i];
       m.add(nums[i]);
       }
       return -1;
    }
}