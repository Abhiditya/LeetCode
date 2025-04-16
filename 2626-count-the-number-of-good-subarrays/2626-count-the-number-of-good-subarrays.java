class Solution {
    public long countGood(int[] nums, int k) {
        return atleastK(nums, k) ;
    }
    private long atleastK(int[] nums, int k){
        HashMap<Integer, Integer> hash= new HashMap<>();
        int n=nums.length;
        int temp=0;
        long count=0;
        int si=0, ei=0;
        while(ei<n){
            //grow
            hash.put(nums[ei], hash.getOrDefault(nums[ei],0)+1);
            if(hash.get(nums[ei])>1) {
                temp+=hash.get(nums[ei])-1;
            }

            //shrink
            while(temp>=k){
                count += (n - ei);
                hash.put(nums[si], hash.get(nums[si])-1);
                temp-=hash.get(nums[si]);
                si++;
                
            }
            
            //update
            
            ei++;
        }
        return count;
    }
}