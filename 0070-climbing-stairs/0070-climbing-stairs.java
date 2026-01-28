class Solution {
    public int climbStairs(int n) {
        if(n<=3){
            return n;
        }
        int a = 1;
        int b = 1;
        int temp = 0;
        for(int i = 2;i<=n;i++){
            temp = a+b;
            a = b;
            b = temp;
            
        }
        return b;
    }
}