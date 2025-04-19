class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        int n= nums.length;
        long count=0;
        for(int i=0; i<n-1; i++){
            // TLE
            // for(int j=i+1; j<n; j++){
            //     if(nums[i]+nums[j]>=lower && nums[i]+nums[j]<=upper){
            //         count++;
            //     }
            // }
            int left= lower-nums[i];
            int right= upper-nums[i];
            int g_idx = nextG(nums, left, i + 1, n);
            int s_idx = nextS(nums, right, i + 1, n);
            count+=s_idx-g_idx;
        }
        return count;
    }

    private int nextG(int nums[], int target, int left, int right){
        int lo = left, hi = right;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] >= target) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }
    private int nextS(int nums[], int target, int left, int right){
        int lo = left, hi = right;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] > target) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }
}