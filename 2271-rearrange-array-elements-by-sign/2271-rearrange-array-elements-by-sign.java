class Solution {
    public int[] rearrangeArray(int[] nums) {
       int n=nums.length;
       int[] m=new int[n];
       int posIndex = 0, negIndex = 1; 
        for (int num : nums) {
            if (num > 0) {
                m[posIndex] = num;
                posIndex += 2;
            } else {
                m[negIndex] = num;
                negIndex += 2;
            }
        }
        return m;
    }
}