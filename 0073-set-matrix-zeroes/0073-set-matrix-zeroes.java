class Solution {
    public void setZeroes(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        boolean[][] arr = new boolean[m][n];
        for(int i=0;i<mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    arr[i][j] = true;
                }
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                if(arr[i][j]){
                    for(int row = 0;row<m;row++){
                        mat[row][j]= 0;
                    }
                    for(int col = 0;col<n;col++){
                        mat[i][col] = 0;
                    }
                }
            }
        }


    }
}