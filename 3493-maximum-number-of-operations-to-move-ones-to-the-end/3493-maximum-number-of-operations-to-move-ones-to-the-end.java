class Solution {
    public int maxOperations(String s) {
        char[] ar=s.toCharArray();
        int f=0; // count of '1's seen so far
        int res=0; // total operations


        for(int i=0;i<ar.length;i++){
            if(ar[i]=='1'){
                f++;
            }else{
// this zero blocks movement => contributes operations
                if( i==ar.length-1||ar[i+1]=='1' ){
                    res+=f;
                }
            }
        }
        return res;
        
    }
}