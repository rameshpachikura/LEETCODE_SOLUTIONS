class Solution {
    public List<String> summaryRanges(int[] nums) {
         List<String> str = new ArrayList<>();
        if (nums.length == 0) return str;

        int start = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                if (start == nums[i - 1]) {
                    str.add(String.valueOf(start));
                } else {
                    str.add(start + "->" + nums[i - 1]);
                }
                start = nums[i];
            }
        }

        if (start == nums[nums.length - 1]) {
            str.add(String.valueOf(start));
        } else {
            str.add(start + "->" + nums[nums.length - 1]);
        }

        return str;
    }
}