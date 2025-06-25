class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> hm=new HashMap<>();
        int n=names.length;
        for(int i=0;i<n;i++){
            hm.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        int c=0;
        String[] a=new String[n];
        for(int i=n-1;i>=0;i--){
            if(hm.containsKey(heights[i])){
                a[c++]=hm.get(heights[i]);
            }
        }
        return a;
    }
}