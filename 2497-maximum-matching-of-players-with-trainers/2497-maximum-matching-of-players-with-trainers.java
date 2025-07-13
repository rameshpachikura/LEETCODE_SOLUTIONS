class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);//4,7,9
        Arrays.sort(trainers);//2,5,8,8
        int c=0;
        int l=trainers.length-1;
        for(int i=players.length-1;i>=0;i--){
            if(players[i]<=trainers[l]){
                c++;
                l--;
                if(l<0){
                    break;
                }
                
            }
        }
        return c;

    }
}