class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] a=new int[2];
        for(int i=1;i<=n/2;i++){
            a[0]=i;
            a[1]=n-a[0];
            boolean z=true;
            String x=Integer.toString(a[0]);
            String y=Integer.toString(a[1]);
            StringBuilder sb1=new StringBuilder(x);
              StringBuilder sb2=new StringBuilder(y);
            for(int j=0;j<sb1.length();j++){
                if(x.charAt(j)=='0'){
                    z=false;
                    break;
                }
            }
            if(z){
                for(int j=0;j<sb2.length();j++){
                if(y.charAt(j)=='0'){
                    z=false;
                    break;
                }
            }
            if(z){
                return a;
            } 
            }
        }
        return a;
    }
}