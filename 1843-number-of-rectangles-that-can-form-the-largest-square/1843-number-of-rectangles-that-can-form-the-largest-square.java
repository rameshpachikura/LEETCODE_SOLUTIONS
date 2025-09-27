class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int n=rectangles.length;
        int min=Integer.MIN_VALUE;
        ArrayList<Integer> a=new ArrayList<>();
        int max=0;
        for(int i=0;i<n;i++){
            int l=rectangles[i][0];
            int w=rectangles[i][1];
            min=Math.min(l,w);
            a.add(min);
            max=Math.max(min,max);
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<a.size();i++){
            hm.put(a.get(i),hm.getOrDefault(a.get(i),0)+1);
        }
        return hm.get(max);
    }
}