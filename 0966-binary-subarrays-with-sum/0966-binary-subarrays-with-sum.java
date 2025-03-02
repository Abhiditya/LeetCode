class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return num_Subarrays_With_Sum(nums,goal)-num_Subarrays_With_Sum(nums,goal-1);
    }

    private int num_Subarrays_With_Sum(int[] nums, int goal) {
        int ans=0;
        int n=nums.length;
        int ei=0, si=0;
        int sum=0;
        while(ei<n){
            //grow
            sum+=nums[ei];
            //shrink
            while(sum>goal && si<=ei){
                sum-=nums[si];
                si++;
            }
            //update
            ans+=(ei-si+1);
            ei++;
        }
        return ans;
    }
}