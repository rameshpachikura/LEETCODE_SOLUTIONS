class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        long s1=0,c1=0;
        long s2=0,c2=0;
        for(int i=0;i<n1;i++){
            if(nums1[i]==0){
                c1++;
            }
            else{
                s1+=nums1[i];
            }
        }
        for(int i=0;i<n2;i++){
               if(nums2[i]==0){
                c2++;
            }
            else{
                s2+=nums2[i];
            }
        }
        long s11=s1+c1;
        long s22=s2+c2;
        if(s11>s22 && c2==0){
            return -1;
        }
        if(s11<s22 && c1==0){
            return -1;
        }
        if(s11>s22){
            return s11;
        }
        return s22;

    }
}