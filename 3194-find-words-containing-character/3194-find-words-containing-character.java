class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].contains(Character.toString(x))){
                a.add(i);
            }
        }
        return a;
    }
}