class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        
        int n = dominoes.length, cnt = 0;
        HashMap<String, Integer> map = new HashMap<>();

        for(int[] arr : dominoes) {
            Arrays.sort(arr);
            String key = "" + arr[0] + arr[1];
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        for(int val: map.values()) {
            cnt += val * (val - 1) / 2;
        }

        return cnt;
    }
}