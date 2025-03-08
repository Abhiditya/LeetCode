class Solution {
    public int longestCommonSubsequence(String str1, String str2) {
        int [][] dp= new int[str1.length()+1][str2.length()+1];
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if(str1.charAt(i-1)==str2.charAt(j-1)) {
					dp[i][j]=1+dp[i-1][j-1];
				}else {
					int s1=dp[i-1][j];
					int s2= dp[i][j-1];
					dp[i][j]= Math.max(s1, s2);
				}
			}
		}
		return dp[dp.length-1][dp[0].length-1];
    }

    public static int LCS(String text1, String text2, int i, int j, int[][] dp) {
		if(i==text1.length() || j==text2.length()) {
			return 0;
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		int ans=0; 
		if(text1.charAt(i)==text2.charAt(j)) {
			ans=1+LCS(text1,text2,i+1,j+1,dp);
		}else {
			int s1=LCS(text1, text2, i+1,j,dp);
			int s2=LCS(text1, text2, i, j+1,dp);
			ans=Math.max(s1, s2);
		}
		return dp[i][j]=ans;
    }
}