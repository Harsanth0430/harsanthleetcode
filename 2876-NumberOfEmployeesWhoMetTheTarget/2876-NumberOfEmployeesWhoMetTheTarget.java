// Last updated: 25/02/2026, 11:19:10
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for(int i=0;i<hours.length;i++){
            if(hours[i]>=target){
                count++;
            }
        }
        return count;
    }
}