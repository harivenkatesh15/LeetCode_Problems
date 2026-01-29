class Solution {
    public int longestCommonSubsequence(String t1, String t2) {
        int m = t1.length();
        int n = t2.length();
        int[][] nums = new int[m+1][n+1];
        for(int i = 0;i<=m;i++){
            nums[i][0] = 0;
        }
        for(int i = 0;i<=n;i++){
            nums[0][i] = 0;
        }
        for(int i = 1;i<nums.length;i++){
            for(int j = 1;j<nums[0].length;j++){
                if(t1.charAt(i-1)==t2.charAt(j-1)){
                    nums[i][j] = nums[i-1][j-1]+1;
                }
                else{
                    nums[i][j] = Math.max(nums[i][j-1],nums[i-1][j]);
                }
            }
        }
        return nums[m][n];
    }
}