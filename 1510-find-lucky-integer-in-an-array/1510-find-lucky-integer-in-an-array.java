class Solution {
    public int findLucky(int[] arr) {
       int n=arr.length;
       HashMap<Integer,Integer> hm=new HashMap<>();
       for(int i=0;i<n;i++){
        hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
       } 
       int max=-1;
       for(int keys:hm.keySet()){
           if(keys==hm.get(keys)){
            max=Math.max(max,keys);
           }
       }
       return max;
    }
}