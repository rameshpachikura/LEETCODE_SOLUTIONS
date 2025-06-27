class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      HashMap<Integer,Integer> hm1=new HashMap<>();
      HashMap<Integer,Integer> hm2=new HashMap<>(); 
      for(int i=0;i<nums1.length;i++){
        hm1.put(nums1[i],hm1.getOrDefault(nums1[i],0)+1);
      }
       for(int i=0;i<nums2.length;i++){
        hm2.put(nums2[i],hm2.getOrDefault(nums2[i],0)+1);
      }
      ArrayList<Integer> a=new ArrayList<>();
      for(int keys1:hm1.keySet()){
          if(hm2.containsKey(keys1)){
             int x=hm1.get(keys1);
             int y=hm2.get(keys1);
             if((x<=y)||(y<=x)){
                a.add(keys1);
             }
          }
      }
      int[] w=new int[a.size()];
      for(int i=0;i<a.size();i++){
        w[i]=a.get(i);
      }
      return w;
    }
}