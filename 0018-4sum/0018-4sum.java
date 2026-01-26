import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        // If less than 4 elements, no answer
        if (n < 4) return result;

        // 1. Sort the array
        Arrays.sort(nums);

        // 2. Fix first number
        for (int i = 0; i < n - 3; i++) {

            // Skip duplicate first numbers
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // 3. Fix second number
            for (int j = i + 1; j < n - 2; j++) {

                // Skip duplicate second numbers
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                // 4. Two pointers
                int left = j + 1;
                int right = n - 1;

                while (left < right) {

                    // Use long to avoid overflow
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        result.add(Arrays.asList(
                                nums[i], nums[j], nums[left], nums[right]
                        ));

                        // Move pointers
                        left++;
                        right--;

                        // Skip duplicate left values
                        while (left < right && nums[left] == nums[left - 1]) left++;

                        // Skip duplicate right values
                        while (left < right && nums[right] == nums[right + 1]) right--;
                    }
                    else if (sum < target) {
                        left++;   // Need bigger sum
                    }
                    else {
                        right--;  // Need smaller sum
                    }
                }
            }
        }
        return result;
    }
}
