// Last updated: 25/02/2026, 11:20:02
class Solution {
    public int minCostToMoveChips(int[] position) {
        int evencost=0;
        int oddcost=0;
        for(int i=0;i<position.length;i++){
             if(position[i]%2==0) {
                evencost++;
        }
         if(position[i]%2!=0){
            oddcost++;
         }
        }
         if(evencost<oddcost) return evencost;
         else return oddcost;
        
    }
}