class Solution {
    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList();
        int i=0;
        while(i < nums.length ){
            StringBuilder sb = new StringBuilder();
            int start = nums[i];
            sb.append(start);
            while(i < nums.length-1 && nums[i]+1 == nums[i+1]) i++;
            if(start != nums[i]){
                sb.append("->").append(nums[i]);
            }
            result.add(sb.toString());
            i++;
        }
        return result;
    }
}