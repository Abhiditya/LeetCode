class Solution {
    public boolean canAliceWin(int[] nums) {
        int single_dig=0, double_dig=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<=9) single_dig+=nums[i];
            else double_dig+=nums[i];
        }
        if(single_dig!=double_dig) return true;
        return false;
    }
}