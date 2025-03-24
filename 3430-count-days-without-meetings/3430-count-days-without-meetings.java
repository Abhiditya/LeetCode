class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        int n=meetings.length;
        int ans=0;
        int high=meetings[0][1];
        if(meetings[0][0]!=1){
            ans+=meetings[0][0]-1;
        }
        for(int i=0; i<n-1; i++){
            if(high<meetings[i+1][0]){
                ans+=(meetings[i+1][0]-high-1);
            }
            high=Math.max(high,meetings[i+1][1]);
        }
        if(high<days){
            ans+=days-high;
        }
        return ans;
    }
}