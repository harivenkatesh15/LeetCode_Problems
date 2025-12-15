class Solution {
    public long getDescentPeriods(int[] p) {
        long count = 1;   
        long total = 1;
        for (int i = 1; i < p.length; i++) {
            if (p[i - 1] - p[i] == 1) {
                count++;
            } else {
                count = 1;
            }
            total += count;
        }
        return total;
    }
}