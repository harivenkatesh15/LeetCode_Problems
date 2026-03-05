class Solution {
    public int minOperations(String s) {
        int sz = 0;
        int so = 0;
        for (int i = 0; i < s.length(); i++) {
            char x = (i % 2 == 0) ? '0' : '1';
            char y = (i % 2 == 0) ? '1' : '0';
            if (s.charAt(i) != x) {
                sz++;
            }
            if (s.charAt(i) != y) {
                so++;
            }
        }

        return Math.min(sz, so);
    }
}