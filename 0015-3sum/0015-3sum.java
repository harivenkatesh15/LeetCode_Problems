class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            map.put(nums[i],i);
        }

        int sum = 0;
        List<List<Integer>> ans  = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                sum = nums[i]+nums[j];
                String s = nums[i]+" "+nums[j]+" "+-1*sum;
    if(map.containsKey(-1*sum) && map.get(-1*sum)>j && !set.contains(s)){
                ans.add(Arrays.asList(nums[i],nums[j],-1*sum));
                set.add(s);

                }
            }
        }
        return ans;
    }
}