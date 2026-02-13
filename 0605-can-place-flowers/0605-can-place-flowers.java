class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        int nn = arr.length;
        if(arr[0]==0 && nn==1){
            return true;
        }
        if(nn>=2 && arr[0]==0 && arr[1]!=1){
            arr[0] = 1;
            n--;
        }
        if(n==0) return true;
        for(int i = 1;i<arr.length-1;i++){
            if(arr[i]==0 && arr[i-1]!=1 && arr[i+1]!=1 && n!=0){
                arr[i] =1;
                n--;
            }
            if(n<=0){
                return true;
            }
        }
        if(nn>=2 &&arr[nn-1]==0 && arr[nn-2]!=1 && n!=0){
            n--;
        }
      
        if(n<=0) return true;
        return false;
    }
}