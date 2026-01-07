class Solution {
    long totalSum = 0;
    long ans = 0;
    int mod = 1000000007;

    // First DFS: calculate total sum
    public long find(TreeNode root) {
        if (root == null) return 0;

        long left = find(root.left);
        long right = find(root.right);

        return left + right + root.val;
    }

    // Second DFS: calculate max product
    public long findAns(TreeNode root) {
        if (root == null) return 0;

        long left = findAns(root.left);
        long right = findAns(root.right);

        long curr = left + right + root.val;

        ans = Math.max(ans, curr * (totalSum - curr));

        return curr;
    }

    public int maxProduct(TreeNode root) {
        totalSum = find(root);
        findAns(root);
        return (int)(ans % mod);
    }
}
