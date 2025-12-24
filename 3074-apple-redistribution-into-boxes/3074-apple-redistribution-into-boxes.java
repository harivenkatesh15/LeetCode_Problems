class Solution {
    public int minimumBoxes(int[] apple, int[] cap) {
        int sum = 0;
        for(int i = 0;i<apple.length;i++){
            sum+=apple[i];
        }
        Arrays.sort(cap);
        int sum1 = 0;
        int cc = 0;
        for(int i = cap.length - 1;i>=0;i--){
            sum1+=cap[i];
            cc++;
            if(sum1>=sum){
                break;
            }
        }
        return cc;
    }
}