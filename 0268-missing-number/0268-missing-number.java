class Solution {

   
    public int missingNumber(int[] arr) {
        int i = 0;
        while(i<arr.length){
            int correct = arr[i];
            if(correct<arr.length && i!=correct){
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            }
            else{
                i++;
            }
        }
        i = 0;
        while(i<arr.length){
            if(arr[i]!=i){
                return i;
            }
            i++;
        }
       
        return i;
    }
}