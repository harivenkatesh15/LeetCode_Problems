class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = 0;
        int c = 0;
        int max = 0;
        for(int i = 1;i<=n-2;){
            s = 0;
            e = 0;
            c = 0;
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                s = i-1;
                e = i+1;
                c=3;
            
            while(s>0 && arr[s]>arr[s-1]){
                s--;
                c++;
            }
            while(e<(n-1) && arr[e]>arr[e+1]){
                e++;
                c++;
                
            }
            i++;
            }
            else{
                i++;
            }
            max = Math.max(max,c);
        }
        return max;
    }
}