class Solution {
    public int[] plusOne(int[] arr) {
         
          int n = arr.length;
           if(arr[n-1]!=9){
                arr[n-1] = arr[n-1]+1;
                return arr;
           }
           int ind = 0;
           for(int i = arr.length-1;i>=0;i--){
                if(arr[i]!=9){
                    arr[i] = arr[i]+1;
                    return arr;
                }
                else{
                    arr[i] = 0;
                }
            }
           
            int[] ar = new int[n+1];
            ar[0] = 1;
            return ar;
    }
}