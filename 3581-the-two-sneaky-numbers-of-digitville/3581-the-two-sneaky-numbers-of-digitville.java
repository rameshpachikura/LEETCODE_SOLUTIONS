class Solution {
    public int[] getSneakyNumbers(int[] nums) {
      int n=nums.length;
      HashMap<Integer,Integer> hm=new HashMap<>();
      for(int i=0;i<n;i++){
        hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
      }   
      ArrayList<Integer> a=new ArrayList<>();
      for(int keys:hm.keySet()){
          if(hm.get(keys)==2){
            a.add(keys);
          }
      }
      int[] arr=new int[a.size()];
      for(int i=0;i<a.size();i++){
        arr[i]=a.get(i);
      }
      return arr;
    }
}