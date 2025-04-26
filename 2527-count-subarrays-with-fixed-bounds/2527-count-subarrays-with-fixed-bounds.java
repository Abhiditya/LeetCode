class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int max=-1;
        int min=-1;
        int n=nums.length;
        int si=0, ei=0;
        long count=0;
        while(ei<n){

            //grow
            int temp=nums[ei];
            if(temp>maxK || temp<minK) {
                si=ei+1;
                min=-1;
                max=-1;
            } 

            //shrink
            if(temp==minK) min=ei;
            if(temp==maxK) max=ei;

            //update
            int k = Math.min(min, max);
            if (k >= si) {
                count += (k - si + 1);
            }
            ei++;
        }
        return count;
    }
}