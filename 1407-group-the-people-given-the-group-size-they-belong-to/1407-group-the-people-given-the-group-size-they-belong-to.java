class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int n = groupSizes.length;
        List<List<Integer>> res = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();

        // Step 1: Group people by required group size
        for (int i = 0; i < n; i++) {
            int size = groupSizes[i];
            hm.putIfAbsent(size, new ArrayList<>());
            hm.get(size).add(i);
        }

        // Step 2: Split each group into chunks of correct size
        for (Map.Entry<Integer, ArrayList<Integer>> entry : hm.entrySet()) {
            int size = entry.getKey();
            ArrayList<Integer> people = entry.getValue();

            for (int i = 0; i < people.size(); i += size) {
                List<Integer> group = new ArrayList<>();
                for (int j = i; j < i + size; j++) {
                    group.add(people.get(j));
                }
                res.add(group);
            }
        }

        return res;
    }
}
