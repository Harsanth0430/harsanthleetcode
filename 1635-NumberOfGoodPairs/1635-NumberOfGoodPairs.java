// Last updated: 25/02/2026, 11:19:54
class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer>freq=new HashMap();
        for(int x:nums){
                freq.put(x,freq.getOrDefault(x,0)+1);
        }
            int pairs=0;
            for(int n:freq.values()){
                pairs+=(n*(n-1))/2;
            }
       return pairs;
    }
}