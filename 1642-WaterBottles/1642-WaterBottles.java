// Last updated: 25/02/2026, 11:19:53
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drink=numBottles;
        int empty=numBottles;
        while(empty>=numExchange){
            int newD=empty/numExchange;
            empty=(empty%numExchange)+newD;
            drink+=newD;
            }    
        return drink;
        
    }
}