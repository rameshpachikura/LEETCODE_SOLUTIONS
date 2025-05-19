class Solution {
    public String triangleType(int[] nums) {
        int a=nums[0];
        int b=nums[1];
        int c=nums[2];
        String x="";
        if( a+b>c && b+c>a && c+a>b){
   
                if(a==b && b==c && c==a){
                    x="equilateral";
                }
                else if(a!=b && b!=c && c!=a){
                       x="scalene";
                }
                else{
                       x="isosceles";
                }
         }
 
        else{
            x="none";
        }
        return x;
    }
}