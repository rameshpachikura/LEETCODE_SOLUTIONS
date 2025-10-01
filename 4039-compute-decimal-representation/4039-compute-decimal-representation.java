class Solution {
    public int[] decimalRepresentation(int n) {
        int digits=(int)Math.log10(n)+1;
        ArrayList<Integer> a=new ArrayList<>();
        int sum=0;
        int j=0;
        while(digits>0){
            int r=n%10;
            int temp=r*(int)Math.pow(10,j);
            if(temp!=0){
                a.add(temp);
            }
            n=n/10;
            j=j+1;
            digits=digits-1;
        }
        Collections.reverse(a);
        int[] b=new int[a.size()];
        for(int i=0;i<a.size();i++){
            b[i]=a.get(i);
        }
        return b;
    }
}