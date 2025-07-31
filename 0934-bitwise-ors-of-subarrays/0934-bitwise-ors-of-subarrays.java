class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> res = new HashSet<>();
        Set<Integer> prev = new HashSet<>();
        Set<Integer> cur = new HashSet<>();
        for (int num : arr) {
            for (int x : prev) {
                cur.add(x | num);
                res.add(x | num);
            }
            cur.add(num);
            res.add(num);
            prev = cur;
            cur = new HashSet<>();
        }
        return res.size();
    }
}