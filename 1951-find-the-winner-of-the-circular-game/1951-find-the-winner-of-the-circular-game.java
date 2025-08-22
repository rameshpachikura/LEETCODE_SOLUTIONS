class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=1;i<=n;i++){
            a.add(i);
        }
        int i=0;
        while(a.size()!=1){
            i=(i+k-1)%a.size();
            a.remove(i);
        }
        return a.get(0);
    }
}
