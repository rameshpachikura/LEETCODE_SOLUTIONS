class Solution {
    public int maxRemoval(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] arr = new int[n+1] ;
        Arrays.sort(queries, (a, b) -> a[0] - b[0]);
        
        int k = queries.length;
        int j = 0;
        int prefix = 0;
        PriorityQueue<Integer> hq = new PriorityQueue<>( Collections.reverseOrder() );


        for (int i = 0; i < n; i++){
            prefix += arr[i];
            while( j < k && queries[j][0] == i){
                hq.offer( queries[j][1]);
                j += 1;
            }
            while (prefix < nums[i] && !hq.isEmpty() && hq.peek() >= i){
                prefix += 1;
                arr[hq.poll() + 1] -= 1;
            }
            if (prefix < nums[i]){
                return -1;
            }
        }
        
        return hq.size() ;
    }
}