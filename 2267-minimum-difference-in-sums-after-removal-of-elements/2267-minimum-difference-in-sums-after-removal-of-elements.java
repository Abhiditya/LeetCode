class Solution {
    public long minimumDifference(int[] nums) {
        int n=nums.length;
        //1st approach
        PriorityQueue<Integer> heap1 = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> heap2 = new PriorityQueue<>();
        long[] left= new long[n];
        long[] right= new long[n];
        long min=0, max=0, diff=Long.MAX_VALUE;

        for(int i=0; i<2*n/3; i++){
            heap1.add(nums[i]);
            min+=nums[i];
            if(heap1.size()>n/3){
                min-=heap1.poll();
            }
            if(i>=n/3-1) left[i]=min;
        }

        for(int i=n-1; i>=n/3; i--){
            heap2.add(nums[i]);
            max+=nums[i];
            if(heap2.size()>n/3){
                max-=heap2.poll();
            }
            if(i<=2*n/3) right[i]=max;
        }
        
        
        for(int i=n/3-1; i<2*n/3; i++){
            diff= Math.min(diff,left[i]-right[i+1]);
        }
        return diff;
    }
}