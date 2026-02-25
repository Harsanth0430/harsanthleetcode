// Last updated: 25/02/2026, 11:19:23
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        if(arrivalTime + delayedTime<24){
            return arrivalTime+ + delayedTime;
        }
        else{
            return(arrivalTime+delayedTime)%24;
        }
        
    }
}