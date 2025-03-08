class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp=new int[coins.length][amount+1];
		for(int[] a: dp) {
			Arrays.fill(a, -1);
		}
		return coinChange(coins,amount,0,dp);
	}
	
	public static int coinChange(int[] coin, int amt, int i, int[][] dp) {
		if(amt==0) {
			return 1;
		}
		if(i==coin.length) {
			return 0;
		}
		if(dp[i][amt]!=-1) {
			return dp[i][amt];
		}
		int inc=0, exc=0;
		if(amt>=coin[i]) {
			inc= coinChange(coin, amt-coin[i],i,dp);
		}
		exc=coinChange(coin,amt,i+1,dp);
		return dp[i][amt]=inc+exc;
	}   
}