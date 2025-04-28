class Solution {
    public long countSubarrays(int[] nums, long k) {
        int n=nums.length;
        long len=0;
        long sum=0;
        long ans=0;
        long score=0;
        int si=0, ei=0;
        while(ei<n){
            //grow
            sum+=nums[ei];
            len++;
            score=sum*len;
            //shrink
            while(score>=k && si<ei){
                sum-=nums[si];
                si++;
                len--;
                score=sum*len;
            }
            //update
            if(score<k){
                ans+=len;
            }
            ei++;
        }
        return ans;
    }
}