class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n - 2; i++) {

            // skip duplicate i
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            HashSet<Integer> seen = new HashSet<>();

            for (int j = i + 1; j < n; j++) {
                int third = - (nums[i] + nums[j]);

                if (seen.contains(third)) {
                    ans.add(Arrays.asList(nums[i], nums[j], third));

                    // skip duplicate j
                    while (j + 1 < n && nums[j] == nums[j + 1]) j++;
                }

                seen.add(nums[j]);
            }
        }
        return ans;
    }
}
