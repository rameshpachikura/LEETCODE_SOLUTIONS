class Solution {
    public double[] convertTemperature(double c) {
        double[] d=new double[2];
        double k=c+273.15;
        double f=(c*1.80)+32;
        d[0]=k;
        d[1]=f;
        return d;
    }
}