class Solution {
    public void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        boolean[][] arr = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    arr[i][j] = true;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j]) {
                    for (int col = 0; col < n; col++) {
                        matrix[i][col] = 0;
                    }
                    for (int row = 0; row < m; row++) {
                        matrix[row][j] = 0;
                    }
                }
            }
        }
    }
}
