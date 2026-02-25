// Last updated: 25/02/2026, 11:19:17
class Solution {
public:
    int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
    if(arrivalTime+ delayedTime <24)
    return arrivalTime+delayedTime;
    if(arrivalTime+ delayedTime==24)
        return 0;
        else return (arrivalTime+ delayedTime-24);
    }
};