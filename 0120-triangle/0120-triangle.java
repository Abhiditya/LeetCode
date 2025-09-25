class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        Integer[][] dp = new Integer[n][n];
        return solve(0, 0, triangle, dp);
    }
    
    private int solve(int i, int j, List<List<Integer>> triangle, Integer[][] dp) {
        int n = triangle.size();
        if (i == n - 1) return triangle.get(i).get(j);
        if (dp[i][j] != null) return dp[i][j];
        int down = triangle.get(i).get(j) + solve(i + 1, j, triangle, dp);
        int diag = triangle.get(i).get(j) + solve(i + 1, j + 1, triangle, dp);
        return dp[i][j] = Math.min(down, diag);
    }
}