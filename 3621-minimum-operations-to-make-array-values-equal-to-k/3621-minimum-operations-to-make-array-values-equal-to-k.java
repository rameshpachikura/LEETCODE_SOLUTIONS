class Solution {
    public int minOperations(int[] nums, int k) {
Set<Integer> uniqueElements = new HashSet<>();
        for (int num : nums) {
            uniqueElements.add(num);
        }

        for (int element : uniqueElements) {
            if (element < k) {
                return -1;
            }
        }

        TreeSet<Integer> sortedElements = new TreeSet<>((a, b) -> b - a);
        sortedElements.addAll(uniqueElements);

        int operationCount = 0;
        int lastProcessed = Integer.MAX_VALUE;

        for (int element : sortedElements) {
            if (element > k) {
          
                if (element != lastProcessed) {
                    operationCount++;
                    lastProcessed = element;
                }
            }

            if (element == k) {
                break;
            }
        }

        return operationCount;
}
}