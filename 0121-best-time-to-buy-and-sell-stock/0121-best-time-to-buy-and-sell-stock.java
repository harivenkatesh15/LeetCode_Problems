class Solution {
    public int maxProfit(int[] nums) {
        
        int min = nums[0];
        int max = 0;
        for(int i = 1;i<nums.length;i++){
                max = Math.max(max,nums[i]-min);
                if(nums[i]<min){
                    min = nums[i];
                }

        }
        return max;
    }
}