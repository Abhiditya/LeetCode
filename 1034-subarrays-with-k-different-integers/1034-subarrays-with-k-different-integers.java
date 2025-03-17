class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return (answer(nums, k) - answer(nums, k-1));
    }

    private int answer(int[] nums, int k){
        int n=nums.length;
        int si=0, ei=0;
        int count=0;
        HashMap<Integer, Integer> hash = new HashMap<>();
        while(ei<n){
            //grow
            hash.put(nums[ei], hash.getOrDefault(nums[ei], 0) + 1);
            //shrink
            while(hash.size()>k){
                hash.put(nums[si], hash.get(nums[si]) - 1);
                if(hash.get(nums[si]) == 0){
                    hash.remove(nums[si]);
                }
                si++;
            }
            //update
            count+=(ei-si+1);
            ei++;
        }
        return count;
    }
}