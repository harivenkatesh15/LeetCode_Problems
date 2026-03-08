import java.util.*;

class Solution {
    private String res;

    private boolean buildNumber(Set<String> numbers, String curr, int n) {
        if (curr.length() == n) {
            if (!numbers.contains(curr)) {
                res = curr;
                return true;
            }
            return false;
        }
        if (buildNumber(numbers, curr + '0', n)) {
            return true;
        }
        if (buildNumber(numbers, curr + '1', n)) {
            return true;
        }

        return false;
    }

    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        Set<String> numbers = new HashSet<>(Arrays.asList(nums));
        buildNumber(numbers, "", n);
        return res;
    }
}