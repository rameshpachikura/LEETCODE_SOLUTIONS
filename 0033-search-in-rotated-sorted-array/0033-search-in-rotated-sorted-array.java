class Solution {
    public int search(int[] nums, int target) {
       int ans=helper(nums,target,0,nums.length-1);
       return ans;
    }
    int helper(int[] nums,int key,int start,int end){
        System.out.println(start+" "+end+" "+(start+(end-start)/2));
       if(start>end){
            return -1;
        }
      int mid=start+(end-start)/2;
      if(nums[mid]==key){
        return mid;
      }  
      if(nums[start]<=nums[mid]){
         if(key>=nums[start] && key<=nums[mid]){
            return helper(nums,key,start,mid-1);
         }
         else{
            return  helper(nums,key,mid+1,end);
        }

      }
      if(key>=nums[mid] && key<=nums[end]){
         return  helper(nums,key,mid+1,end);
      }
       return helper(nums,key,start,mid-1);
    }
}
