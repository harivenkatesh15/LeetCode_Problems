class Solution {
    public int numberOfWays(String corridor) {
        int MOD = 1_000_000_007;

        // Store indices of all seats
        List<Integer> seats = new ArrayList<>();
        for (int i = 0; i < corridor.length(); i++) {
            if (corridor.charAt(i) == 'S') {
                seats.add(i);
            }
        }

        // Invalid cases
        if (seats.size() == 0 || seats.size() % 2 != 0) return 0;

        long ways = 1;

        // Multiply choices between every pair-group
        for (int i = 1; i < seats.size() - 1; i += 2) {
            int left = seats.get(i);
            int right = seats.get(i + 1);
            ways = (ways * (right - left)) % MOD;
        }

        return (int) ways;
    }
}
