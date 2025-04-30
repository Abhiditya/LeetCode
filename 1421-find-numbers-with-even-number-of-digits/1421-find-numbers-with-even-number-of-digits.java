class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0; i<n; i++){
            int temp=nums[i];
            int len=0;
            while(temp>0){
                len++;
                temp/=10;
            }
            if(len%2==0) count++;
        }
        return count;
    }
}