class Solution {
    public int longestPalindromeSubseq(String s) {
        int m = s.length();
        int n = m;
        String s1 = new StringBuilder(s).reverse().toString();
        int[][] nums = new int[m+1][m+1];
        for(int i = 0;i<nums.length;i++){
            nums[i][0] = 0;
        }
        for(int i = 0;i<nums[0].length;i++){
            nums[0][i] = 0;
        }
        for(int i = 1;i<nums.length;i++){
            for(int j = 1;j<nums.length;j++){
                if(s.charAt(i-1)==s1.charAt(j-1)){
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