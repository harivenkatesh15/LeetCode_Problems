class Solution {
    public long maximumProfit(int[] prices, int k) {

        long[] flat = new long[k + 1];
        long[] longPos = new long[k + 1];
        long[] shortPos = new long[k + 1];

        long NEG = Long.MIN_VALUE / 4;

        // Initialize states
        for (int i = 0; i <= k; i++) {
            longPos[i] = NEG;
            shortPos[i] = NEG;
        }

        for (int price : prices) {
            for (int t = k - 1; t >= 0; t--) {

                // Close transactions
                flat[t + 1] = Math.max(flat[t + 1], longPos[t] + price);
                flat[t + 1] = Math.max(flat[t + 1], shortPos[t] - price);

                // Open transactions
                longPos[t] = Math.max(longPos[t], flat[t] - price);
                shortPos[t] = Math.max(shortPos[t], flat[t] + price);
            }
        }

        long ans = 0;
        for (int t = 0; t <= k; t++) {
            ans = Math.max(ans, flat[t]);
        }

        return ans;
    }
}
