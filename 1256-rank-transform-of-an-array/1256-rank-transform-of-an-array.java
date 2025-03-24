class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] r=new int[arr.length];
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        ArrayList<Integer> a=new ArrayList<>(hs);
        Collections.sort(a);
        int c=1;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<a.size();i++){
            hm.put(a.get(i),c);
            c++;
        }
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                r[i]=hm.get(arr[i]);
            }
        }
        return r;



    }
}