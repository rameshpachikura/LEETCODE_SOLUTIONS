class Solution {
    public String[] findWords(String[] words) {
        String[] arr={"qwertyuiop","asdfghjkl","zxcvbnm"};
        HashMap<Character,Integer> hm1=new HashMap<>();
        HashMap<Character,Integer> hm2=new HashMap<>();
        HashMap<Character,Integer> hm3=new HashMap<>();
        for(char ch:arr[0].toCharArray()){
            hm1.put(ch,1);
        }
        for(char ch:arr[1].toCharArray()){
            hm2.put(ch,1);
        }       
        for(char ch:arr[2].toCharArray()){
            hm3.put(ch,1);
        }
       ArrayList<String> a=new ArrayList<>();
        int c=0;
        for(int i=0;i<words.length;i++){
            String word=words[i].toLowerCase();
            int h1=0;
            int h2=0;
            int h3=0;
            for(int j=0;j<word.length();j++){
                char ch=word.charAt(j);
                if(hm1.containsKey(ch)){
                    h1++;
                }
                if(hm2.containsKey(ch)){
                    h2++;
                } 
                if(hm3.containsKey(ch)){
                    h3++;
                }    
            }
            if((h1==word.length())||(h2==word.length())||(h3==word.length())){
                a.add(words[i]);
            }
        }
        String[] str=new String[a.size()];
        for(int i=0;i<a.size();i++){
            str[i]=a.get(i);
        }
     return str;
    }
}