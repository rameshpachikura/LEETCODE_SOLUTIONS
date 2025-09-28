class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
         HashMap<String,List<String>> hm1=new HashMap<>();
        int n=strs.length;
        for(int i=0;i<n;i++){
            StringBuilder str=new StringBuilder();
            char[] c=strs[i].toCharArray();
            Arrays.sort(c);
            //System.out.println(c);
            for(int j=0;j<c.length;j++){
                str.append(c[j]);
            }
             hm1.computeIfAbsent(str.toString(), k -> new ArrayList<>()).add(strs[i]);
        }
        for(String key:hm1.keySet()){
            ans.add(new ArrayList<>(hm1.get(key)));
        }
        return ans;
    }
}