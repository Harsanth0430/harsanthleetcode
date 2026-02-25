// Last updated: 25/02/2026, 11:19:32
class Solution {
    public double[] convertTemperature(double celsius) {
        double[] d=new double[2];
        d[0]=celsius + 273.15;
        d[1]=celsius * 1.80 + 32.00;
        return d;
    }
    
}