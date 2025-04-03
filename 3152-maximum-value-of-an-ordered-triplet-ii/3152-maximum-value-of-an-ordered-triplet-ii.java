class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans=0;
        int n=nums.length;
        int max_i = nums[0];
        int maxDiff = Integer.MIN_VALUE;

        for (int j = 1; j < n - 1; j++) {
            maxDiff = Math.max(maxDiff, max_i - nums[j]);
            ans = Math.max(ans, (long) maxDiff * nums[j + 1]);
            max_i = Math.max(max_i, nums[j]);
        }
        return ans;
    }
}