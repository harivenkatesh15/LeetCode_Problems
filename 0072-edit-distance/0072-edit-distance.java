class Solution {
    public int minDistance(String w1, String w2) {
        int m = w1.length();
        int n = w2.length();
        int[][] nums = new int[m+1][n+1];
        for(int i = 0;i<=m;i++){
            nums[i][0] = i;
        }
        for(int i = 0;i<=n;i++){
            nums[0][i] = i;
        }
        for(int i = 1;i<=m;i++){
            for(int j = 1;j<=n;j++){
                if(w1.charAt(i-1)==w2.charAt(j-1)){
                    nums[i][j] = nums[i-1][j-1];
                }
                else{
                    nums[i][j] = Math.min(nums[i-1][j-1],Math.min(nums[i-1][j],nums[i][j-1]))+1;
                }
            }
        }
        return nums[m][n];
    }
}