class Solution {

    public boolean check(int i, int j,int n,int m,int[][] arr){
        for(int x = 0;x<m;x++){
            if(arr[i][x]!=0 && x!=j){
                return false;
            }
        }
        for(int x = 0;x<n;x++){
            if(arr[x][j]!=0 && x!=i){
                return false;
            }
        }
        return true;
    }

    public int numSpecial(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int c = 0;
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                if(mat[i][j]==1 && check(i,j,n,m,mat)){
                    c++;
                }
            }
        }
        return c;

    }
}