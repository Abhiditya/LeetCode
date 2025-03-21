class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return kOddNum(nums, k) - kOddNum(nums, k-1)  ;
    }

    private int kOddNum(int[] nums, int k){
        int count=0;
        int si=0, ei=0;
        int n=nums.length;
        int odd=0;
        while(ei<n){
            //grow
            if(nums[ei]%2!=0){
                odd++;
            }
            //shrink
            while(odd>k && si<=ei){
                if(nums[si]%2!=0)
                odd--;
                si++;
            }
            //update
            count+=ei-si+1;
            ei++;
        }
        return count;
    }
}