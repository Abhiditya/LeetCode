class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg=0;
        for(int i=0; i<k; i++){
            avg+=nums[i];
        }
        double max=avg;
        int si=0, ei=k;
        while(ei<nums.length){
            avg=avg-nums[si]+nums[ei];
            if(avg>max) max=avg;
            ei++;
            si++;
        }
        return (max/k) ;
    }
}