class Solution {
    public int maxSum(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        
        for(int num:nums)
        set.add(num);
        int negativeNum =Integer.MIN_VALUE;
        int sum=0;

        for(Integer num:set)
        {
            if(num>0)
            {
                sum+=num;
            }
            else
            {
                if(num>negativeNum)
                negativeNum=num;
            }
        }
        if(sum!=0)
        return sum;
        
        return negativeNum;

    }
}