class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        boolean flag=true;
        int len=1;
        for(int i=n-2; i>=0; i--){
            if(nums[i]<len){
                len++;
                flag=false;
            }else{
                len=1;
                flag=true;
            }
        }
        return flag;
    }
}