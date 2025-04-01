class Solution {
    public long mostPoints(int[][] questions) {
        long[] dp= new long[questions.length];
        Arrays.fill(dp,-1);
        return solve(0,questions,dp);
    }
    private long solve(int i, int[][] arr, long[] dp){
        if(i>=arr.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        long nopick=solve(i+1,arr,dp);
        int nextIndex = i + arr[i][1] + 1;
        long pick = arr[i][0] + (nextIndex < arr.length ? solve(nextIndex, arr, dp) : 0);
        return dp[i]=Math.max(pick,nopick);
    }
}