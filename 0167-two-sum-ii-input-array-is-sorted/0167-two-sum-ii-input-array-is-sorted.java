class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] a=new int[2];
        int n=numbers.length;
        int t1=0;
        int t2=n-1;
        while(t1<=t2){
            if((numbers[t1]+numbers[t2])>target){
                t2--;
            }
            else if((numbers[t1]+numbers[t2])<target){
                t1++;
            }
            else{
                a[0]=t1+1;
                a[1]=t2+1;
                return a;
            }
        }
        return a;
    }
}