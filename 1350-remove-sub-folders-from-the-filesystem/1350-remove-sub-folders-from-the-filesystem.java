class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);  // Sort lexicographically
        List<String> res = new ArrayList<>();
        res.add(folder[0]);   // Add the first folder

        for (int i = 1; i < folder.length; i++) {
            String prev = res.get(res.size() - 1);
            // If current folder is not a subfolder of the last added one
            if (!folder[i].startsWith(prev + "/")) {
                res.add(folder[i]);
            }
        }
        return res;
    }
}
