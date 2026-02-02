class Solution {
    public String shiftingLetters(String ss, int[] nums) {
        int prev = 0;

        // Suffix sum with mod
        for (int i = nums.length - 1; i >= 0; i--) {
            prev = (prev + nums[i]) % 26;
            nums[i] = prev;
        }

        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < nums.length; j++) {
            char ch = (char) ((ss.charAt(j) - 'a' + nums[j]) % 26 + 'a');
            sb.append(ch);
        }

        return sb.toString();
    }
}
