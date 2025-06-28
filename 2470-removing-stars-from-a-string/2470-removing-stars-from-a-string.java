class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch!='*'){
                st.push(ch);
            }
            else{
                st.pop();
            }
        }
        System.out.println(st);
        StringBuilder str=new StringBuilder();
       while(!st.isEmpty()){
            str.append(st.pop());
        }
        return str.reverse().toString();

    }
}