class Solution {
    public int maxProfit(int[] arr) {
       int min = arr[0];
       int max = 0;
       for(int i = 1;i<arr.length;i++){
        if(arr[i]-min>max){
            max = arr[i]-min;
        }
        if(arr[i]<min){
            min=arr[i];
        }
       }
       return max;
    }
}