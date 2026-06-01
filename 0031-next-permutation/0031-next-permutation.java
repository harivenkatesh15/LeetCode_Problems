class Solution {
    public void nextPermutation(int[] nums) {
        int r = nums.length;
        int ind = -1;
        for(int i = r - 2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind = i;
                break;
            }
        }
        int ind1 = -1;
        for(int i = r - 1;i>=0;i--){
            if(ind!=-1 && nums[i]>nums[ind]){
                ind1 = i;
                break;
            }
        }
        System.out.println(ind);
        if(ind==-1){
            rev(0,nums);
        }
        else{
        swap(ind,ind1,nums);
        rev(ind+1,nums);
        }
        

    }
    public void swap(int r,int l,int[] nums){
        if(r !=-1 && l!=-1){
        int temp = nums[r];
        nums[r] = nums[l];
        nums[l] = temp;
        }
    
    }
    public void rev(int i,int[] nums){
        int n = nums.length -1;
        while(i<=n){
            swap(i,n,nums);
            i++;
            n--;
        }
    }
}