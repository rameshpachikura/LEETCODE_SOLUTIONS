class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int[] res=new int[2];
        int c=1;
        int n=grid.length;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                hm.put(grid[i][j],hm.getOrDefault(grid[i][j],0)+1);
            }
        }
        for(int keys:hm.keySet()){
            int y=hm.get(keys);
            if(y>c){
                res[0]=keys;
            }
        }

      for(int i=1;i<=n*n;i++){
            if(hm.containsKey(i)){
                continue;
            }
            else{
                res[1]=i;
            }
        } 
        return res;
    }
}