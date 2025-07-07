class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int distance = 0;
        while(mainTank!=0){
            distance+=1;
            mainTank--;

            if(distance%5==0 && additionalTank>0){
                additionalTank--;
                mainTank++;
            }    
        }
        return distance*10;
    }
}