class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        int n=nums.length;
        int max=0, sum=0;
        int si=0, ei=0;
        while(ei<n){
            int temp=nums[ei];
            if(hash.contains(temp)){
                while(hash.contains(temp)){
                    hash.remove(nums[si]);
                    sum-=nums[si];
                    si++;
                }
            }
            hash.add(temp);
            sum+=temp;
            ei++;
            if(max<sum) max=sum;
        }
        return max;
    }
}