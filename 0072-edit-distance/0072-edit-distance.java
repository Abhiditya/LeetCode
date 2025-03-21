class Solution {
    public int minDistance(String word1, String word2) {
        int[][]  dp= new int[word1.length()][word2.length()];
		for(int [] a:dp) {
			Arrays.fill(a, -1);
		}
        return Min_oprs(word1,word2,0,0,dp);
    }

    public static int Min_oprs(String s, String t, int i, int j, int[][] dp) {
		if(j==t.length()) {
			return s.length()-i;
		}
		if(i==s.length()) {
			return t.length()-j;
		}
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
		int ans=0;
		if(s.charAt(i)==t.charAt(j)) {
			ans=Min_oprs(s,t,i+1,j+1,dp);
		}else {
			int D=Min_oprs(s, t, i+1, j,dp);
			int I=Min_oprs(s, t, i, j+1,dp);
			int R=Min_oprs(s, t, i+1, j+1,dp);
			ans=Math.min(I, Math.min(D, R))+1;
		}
		return dp[i][j]=ans;
	}
}