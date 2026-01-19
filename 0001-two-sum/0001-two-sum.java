class Solution {
    public int[] twoSum(int[] nums, int t) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for(int i = 0;i<nums.length;i++){
            int c = t-nums[i];
            if(map.containsKey(c)){
                ans[0] = map.get(c);
                ans[1] = i;
                return ans;
            }
            map.put(nums[i],i);

        }
        return ans;
    }
}