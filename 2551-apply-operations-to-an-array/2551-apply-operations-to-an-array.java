class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        int[] ans= new int[n];
        int zeroes=0;
        for(int i=0; i<n-1; i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        int j=0;
        int k=n-1;
        for(int i=0; i<n; i++){
            if(nums[i]!=0){
                ans[j++]=nums[i];
            }else{
                ans[k--]=0;
            }
        }
        
        return ans;
    }
}