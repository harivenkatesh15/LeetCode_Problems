class Solution {
    public int[] countBits(int n) {
            int[] arr = new int[n+1];
            for(int i = 1;i<=n;i++){
            int dc =  (int)(Math.log(i)/Math.log(2)+1);
            System.out.println(i+""+dc);
            int c = 0;
            int k = 0;
            int temp = i;
            while(k<=dc) {

                if(temp/(int)Math.pow(2,k) % 2==1){
                    c++;
                }
                k++;
            }
            arr[i] = c;

        }
        return arr;
    }
}
