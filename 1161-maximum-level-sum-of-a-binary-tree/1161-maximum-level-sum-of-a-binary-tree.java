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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int cursum = 0;
        int curl = 1;
        int maxl = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;

        while (!queue.isEmpty()) {
            cursum = 0;
            int s = queue.size();
            for(int i = 0;i<s;i++){
                TreeNode cur = queue.poll();
                cursum+=cur.val;
                if (cur.left != null) {
                queue.add(cur.left);
                }

                if (cur.right != null) {
                queue.add(cur.right);
                }
            }
            if(cursum>max){
                max = cursum;
                maxl = curl;
            }
            curl++;

        }
        return maxl;
    }
}