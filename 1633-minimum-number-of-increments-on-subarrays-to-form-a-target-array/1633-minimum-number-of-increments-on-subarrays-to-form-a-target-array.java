class Solution {
    public int minNumberOperations(int[] target) {
        int n = target.length;
        int res = target[0];
        for (int i = 1; i < n; i++) {
            res += target[i] > target[i - 1] ? target[i] - target[i - 1] : 0;
        }
        return res;
    }
}