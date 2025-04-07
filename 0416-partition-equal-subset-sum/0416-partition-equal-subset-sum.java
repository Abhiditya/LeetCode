class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=nums[i];
        }
        if(sum%2!=0) return false;
        int temp=sum/2;
        Boolean[][] dp= new Boolean[n][temp+1];
        return solve(nums, temp, dp, 0);
    }

    private Boolean solve(int[] nums, int key, Boolean[][] dp, int i){
        if(key==0) return true;
        if(i>=nums.length || key<0) return false;

        if(dp[i][key]!=null) return dp[i][key];

        Boolean pick= solve(nums, key-nums[i], dp, i+1);
        Boolean nopick= solve(nums, key, dp, i+1);

        return dp[i][key]=pick|nopick;
    }

}