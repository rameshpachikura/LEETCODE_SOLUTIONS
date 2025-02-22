import java.util.*;

class Solution {
    public TreeNode recoverFromPreorder(String traversal) {
        int c = 0; // Track depth (number of '-')
        int n = traversal.length();
        LinkedHashMap<TreeNode, Integer> hm = new LinkedHashMap<>();
        
        int i = 0;
        while (i < n) {
            // Count depth (consecutive '-')
            while (i < n && traversal.charAt(i) == '-') {
                c++;
                i++;
            }

            // Read node value
            int start = i;
            while (i < n && Character.isDigit(traversal.charAt(i))) {
                i++;
            }
            int value = Integer.parseInt(traversal.substring(start, i));
            TreeNode node = new TreeNode(value);

            // Store in LinkedHashMap
            hm.put(node, c);
            c = 0; // Reset depth count for the next node
        }

        // Construct the tree from HashMap
        TreeNode root = null;
        Stack<TreeNode> stack = new Stack<>();
        for (Map.Entry<TreeNode, Integer> entry : hm.entrySet()) {
            TreeNode node = entry.getKey();
            int depth = entry.getValue();
            
            // If stack has more elements than depth, pop to the correct level
            while (stack.size() > depth) {
                stack.pop();
            }

            // Attach to parent
            if (!stack.isEmpty()) {
                TreeNode parent = stack.peek();
                if (parent.left == null) {
                    parent.left = node;
                } else {
                    parent.right = node;
                }
            } else {
                root = node; // First node is the root
            }

            stack.push(node); // Add to stack
        }

        return root;
    }
}
