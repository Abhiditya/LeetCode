class Solution {
    public int change(int amt, int[] coin) {
        int[][] dp=new int[coin.length+1][amt+1];
		for(int i=0; i<dp.length; i++) {
			dp[i][0]=1;
		}
		for (int i = 1; i < dp.length; i++) {
			for (int am =1; am < dp[0].length; am++) {
				int inc=0, exc=0;
				if(am>=coin[i-1]) {
					inc= dp[i][am-coin[i-1]];
				}
				exc=dp[i-1][am];
				dp[i][am]=inc+exc;
			}
		}
		return dp[dp.length-1][dp[0].length-1];
	}
	
	// public static int coinChange(int[] coin, int amt, int i, int[][] dp) {
	// 	if(amt==0) {
	// 		return 1;
	// 	}
	// 	if(i==coin.length) {
	// 		return 0;
	// 	}
	// 	if(dp[i][amt]!=-1) {
	// 		return dp[i][amt];
	// 	}
	// 	int inc=0, exc=0;
	// 	if(amt>=coin[i]) {
	// 		inc= coinChange(coin, amt-coin[i],i,dp);
	// 	}
	// 	exc=coinChange(coin,amt,i+1,dp);
	// 	return dp[i][amt]=inc+exc;
	// }   
}