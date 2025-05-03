class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int res1 = solve(tops, bottoms, tops[0]);
        int res2 = (tops[0] == bottoms[0]) ? -1 : solve(tops, bottoms, bottoms[0]);

        if(res1 == -1) return res2;
        if(res2 == -1) return res1;
        return Math.min(res1, res2);
    }
    public int solve(int[] tops, int[] bottoms, int target) {
        int T = 0;
        int B= 0;
        int n = tops.length;

        for(int i = 0; i < n; i++) {
            if(tops[i] != target && bottoms[i] != target)
                return -1;
            else if(tops[i] != target)
                T++;
            else if(bottoms[i] != target)
                B++;
        }
        return Math.min(T, B);
    }
}