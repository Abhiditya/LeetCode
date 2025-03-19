class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0; i<n; i++){
            if(nums[i]==0 && i+2<n){
                for(int j=i; j<i+3; j++){
                    if(nums[j]==0){
                        nums[j]=1;
                    }else{
                        nums[j]=0;
                    }
                }
                ans++;
            }
        }
        if(nums[nums.length - 1] == 0 || nums[nums.length - 2] == 0){
            return -1;
        }
        return ans;
    }
}