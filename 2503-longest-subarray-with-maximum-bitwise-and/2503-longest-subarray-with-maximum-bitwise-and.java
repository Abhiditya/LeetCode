class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0; i<n; i++){
            max=Math.max(max,nums[i]);
        }
        int len=0, lenM=0;
        for(int val: nums){
            if(val==max){
                len++;
            }else{
                lenM=Math.max(len,lenM);
                len=0;
            }
        }
        return Math.max(len,lenM);
    }
}