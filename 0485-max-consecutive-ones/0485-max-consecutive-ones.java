class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cc = Integer.MIN_VALUE;
        int c = 0;
        for(int i = 0;i<nums.length;i++){

            if(nums[i]==1){
                c++;
            }
            else{
            cc = Math.max(c,cc);
            c=0;
            }
        }
        cc = Math.max(c,cc);
        return cc;
    }
}