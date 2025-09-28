class Solution {
    public int reverseBits(int n) {
        String b1=Integer.toBinaryString(n);
        StringBuilder s=new StringBuilder();
         for (int i = b1.length(); i < 32; i++) {   // add (32 - length) zeros
            s.append('0');
        }
        s.append(b1);
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
            }
            System.out.println(s+" "+sb.toString());
        int d=Integer.parseInt(sb.toString(),2);
        return d;
    }
}