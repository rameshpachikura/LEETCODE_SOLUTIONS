class Solution {
    public boolean checkIfExist(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(arr[i],i);
        }
        for(int i=0;i<n;i++){
            int x=arr[i]*2;
            if(hm.containsKey(x) && hm.get(x)!=i){
                return true;
            }
        }
    
        return false;

    }
}