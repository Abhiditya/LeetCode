class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n=nums.length;
        int len=0;
        int si=0, ei=0;
        while(ei<n){
            //grow
            ei++;
            //shrink
            while(!checkAnds(nums,si,ei)){
                si++;
            }
            //update
            len=Math.max(len,ei-si);
        }
        return len;
    }

    public boolean checkAnds(int[] nums, int si, int ei){
        int xorSum = 0, sum = 0;
        for (int i=si; i<ei; i++) {
            xorSum ^= nums[i];
            sum += nums[i];
        }
        return xorSum == sum;
    }
}