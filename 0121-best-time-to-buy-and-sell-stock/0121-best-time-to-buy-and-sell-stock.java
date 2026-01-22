class Solution {
    public int maxProfit(int[] arr) {
        int maxp = Integer.MIN_VALUE;
        int min = arr[0];
        for(int i = 1;i<arr.length;i++){

            maxp = Math.max(maxp,arr[i]-min);
            if(arr[i]<min){
                    min = arr[i];
            }
        
        }
        if(maxp<=0){
            return 0;
        }
        return maxp;
    }
}