class Solution {
    public long distributeCandies(int n, int limit) {
        long count=0;
        for(long i=0; i<=Math.min(limit,n); i++){
            long max=Math.min(limit,n-i);
            long min=Math.max(n-i-limit,0);
            long j=max-min+1;
            if(max>=min) count+=j;
        }
        return count;
    }
}