import java.util.ArrayList;

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();

        // Categorizing elements into three lists
        for (int i = 0; i < n; i++) {
            if (nums[i] < pivot) {
                a.add(nums[i]);
            } else if (nums[i] > pivot) {
                c.add(nums[i]);
            } else {
                b.add(nums[i]);
            }
        }

        // Merging lists
        a.addAll(b);
        a.addAll(c);

        // Converting ArrayList to int[]
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = a.get(i);
        }
        
        return ans;
    }
}
