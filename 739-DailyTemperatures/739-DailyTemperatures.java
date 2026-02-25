// Last updated: 25/02/2026, 11:20:11
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       int n =temperatures.length;
       Stack<Integer>s=new Stack();
       int[] ans=new int[n];
       for(int cd=0;cd<n;cd++){
        int x=temperatures[cd];
        while(!s.empty()&&x>temperatures[s.peek()]){
            ans[s.peek()]=cd-s.peek();
            s.pop();
        }
        s.push(cd);
       }
       return ans;
    }
}