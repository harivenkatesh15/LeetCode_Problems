class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>0){
                int ind = i+(nums[i]%n);
                res[i] = nums[ind%n];
            }
            else{
                int ind = Math.abs(nums[i])%n;
                if(i-ind<0){
                    res[i] = nums[n+(i-ind)];
                }
                else{
                    res[i] = nums[i-ind];
                }

            }
        }
        return res;
    }
}