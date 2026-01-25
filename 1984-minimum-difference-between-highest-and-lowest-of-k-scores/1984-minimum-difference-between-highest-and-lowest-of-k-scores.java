class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length==1){
            return 0;
        }
        Arrays.sort(nums);
        int n = nums.length;
        int j = k-1;
        int i = 0;
        int min = Integer.MAX_VALUE;
        while(j<n){
                int mins = nums[i];
                int mink = nums[j];
                min = Math.min(min,mink-mins);
                i++;
                j++;

        }
        return min;
        
    }
}