/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    List<Integer> sortedValues = new ArrayList<>();
    private void inOrder(TreeNode node) {
        if (node == null) return;
        inOrder(node.left);
        sortedValues.add(node.val);
        inOrder(node.right);
    }
    public TreeNode balanceBST(TreeNode root) {
        inOrder(root);

        return buildBalancedTree(0, sortedValues.size() - 1);
    }
    public TreeNode buildBalancedTree(int start, int end) {
       
        if (start > end) return null;
        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(sortedValues.get(mid));
        node.left = buildBalancedTree(start, mid - 1);
        node.right = buildBalancedTree(mid + 1, end);
        return node;
    }
}