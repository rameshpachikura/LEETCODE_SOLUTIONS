class Solution {
    public int minMaxDifference(int num) {
        String str = String.valueOf(num);
        int n=str.length();
        StringBuilder maxx=new StringBuilder();
        StringBuilder min=new StringBuilder();
        char ch=' ';
        char ch1=' ';
        for(int i=0;i<n;i++){
            if(str.charAt(i)!='9'){
                ch=str.charAt(i);
                break;
            }
        }
   
         for(int i=0;i<n;i++){
            if(str.charAt(i)!='0'){
                ch1=str.charAt(i);
                break;
            }
        }
        for(int i=0;i<n;i++){
            if(str.charAt(i)==ch){
                maxx.append('9');
            }
            else{
                maxx.append(str.charAt(i));
            }
            if(str.charAt(i)==ch1){
                min.append('0');
            }
            else{
                min.append(str.charAt(i));
            }
        }
    
        int num1 = Integer.parseInt(maxx.toString());
         int num2 = Integer.parseInt(min.toString());
             System.out.println(num1);
        System.out.println(num2);
         return Math.abs((num1-num2));
    }
}