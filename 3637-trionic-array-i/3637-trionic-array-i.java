class Solution {
    public boolean isTrionic(int[] nums) {
        int p = 0;
        boolean f1 = false;
        int n = nums.length;
        while (p + 1 < n && nums[p] < nums[p + 1]) {
            p++;
            f1 = true;
        }
        int q = p;
        boolean f2 = false;
        while (q + 1 < n && nums[q] > nums[q + 1]) {
            q++;
            f2 = true;
        }
        int k = q;
        boolean f3 = false;
        while (k + 1 < n && nums[k] < nums[k + 1]) {
            f3 = true;
            k++;
        }
        if (f1 && f2 && f3 && (p < q) && (q < k) && k == n - 1) {
            return true;
        } else {
            return false;
        }
    }
}