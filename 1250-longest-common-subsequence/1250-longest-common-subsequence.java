class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][]  dp= new int[text1.length()][text2.length()];
		for(int [] a:dp) {
			Arrays.fill(a, -1);
		}
        return LCS(text1, text2,0,0,dp);
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