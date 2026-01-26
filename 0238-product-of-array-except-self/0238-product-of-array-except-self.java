class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pss = new int[n];
        int[] sss = new int[n];
        pss[0] = 1;
        sss[n-1] = 1;
        int k = 1;
        for(int i = 0;i<nums.length-1;i++){
            pss[i+1] = pss[i]*nums[i];
            sss[n-i-2] = sss[n-i-1]*nums[n-i-1];
        }
        int ans[] = new int[n];
        for(int i = 0;i<n;i++){
            ans[i] = pss[i]*sss[i];
        }
        return ans;

    }
}