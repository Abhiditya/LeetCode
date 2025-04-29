class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max=-1;
        int n=nums.length;
        for(int i=0; i<n; i++){
            max= Math.max(max,nums[i]);
        }
        int si=0, ei=0;
        long count=0, freq=0;
        while(ei<n){
            if(nums[ei]==max) freq++;
            
            while(freq>=k){
                count+=n-ei;
                if(nums[si]==max){
                    freq--;
                }
                si++;
            }
            
            ei++;
        }
        return count;
    }
}