class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int[][] mat=new int[n/3][3];
        int c=0;
        for(int i=0;i<n/3;i++){
            for(int j=0;j<3;j++){
                mat[i][j]=nums[c++];
            }
        }
        int x=0;
       for (int i = 0; i < mat.length; i++) {
            int[] row = mat[i];
            if(check(row,k)){
                x++;
            }
            else{
                break;
            }
            
        }
        if(x!=n/3){
           return new int[0][];
        }
        return mat;

        
    }
    public static boolean check(int[] arr,int k){
       return Math.abs(arr[0] - arr[1]) <= k &&
               Math.abs(arr[1] - arr[2]) <= k &&
               Math.abs(arr[0] - arr[2]) <= k;
    }
}