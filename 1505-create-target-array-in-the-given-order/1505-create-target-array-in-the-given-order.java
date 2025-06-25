class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            int idx = index[i];
            int val = nums[i];

            if (i > idx) {
                for (int j = i; j > idx; j--) {
                    a[j] = a[j - 1];
                }
            }
            a[idx] = val;
        }

        return a;
    }
}
