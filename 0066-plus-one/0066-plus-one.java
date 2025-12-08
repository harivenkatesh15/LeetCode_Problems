class Solution {
    public int[] plusOne(int[] arr) {
        int n = arr.length-1;
        if(arr[n]!=9){
            arr[n] = arr[n]+1;
            return arr;
        }

        while(n>=0 && arr[n]==9){
            arr[n] = 0;
            n--;
        }
        int prev = 0;
        if(n>=0){
            prev = arr[n];
        }
        int nn = arr.length;
        if(n<0){
            n = n+1;
            nn = arr.length+1;
        }
        int[] nums = new int[nn];
        for(int i = 0;i<n;i++){
            nums[i] = arr[i];
        }

        nums[n] = prev+1;
        return nums;
        
    }
}