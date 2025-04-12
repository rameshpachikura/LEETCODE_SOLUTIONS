class Solution {
    public int countSymmetricIntegers(int low, int high) {
       int count=0;
       for(int i=low;i<=high;i++){
            if(even(i)){
                if(symmetric(i)){
                    count++;
                }
            }
       }
       return count;
    }
    public boolean even(int num){
         int digits = (int) Math.floor(Math.log10(Math.abs(num))) + 1;
         if(digits%2==0){
            return true;
         }
         return false;
    }
    public boolean symmetric(int n){
        String str = String.valueOf(n);
        int length = str.length();
        int mid = length / 2;

        int leftSum = 0, rightSum = 0;

        for (int i = 0; i < mid; i++) {
            leftSum += Character.getNumericValue(str.charAt(i));
        }

        for (int i = (length % 2 == 0 ? mid : mid + 1); i < length; i++) {
            rightSum += Character.getNumericValue(str.charAt(i));
        }
        if(leftSum==rightSum){
            return true;
        }
        return false;
    }
}