class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> hash= new HashSet<>();
        int n=nums.length;
        for(int i=0; i<n; i++){
            hash.add(nums[i]);
        }
        int dis=hash.size();
        int count=0;
        for(int i=0; i<n; i++){
            HashSet<Integer> hash_temp= new HashSet<>();
            for(int j=i; j<n; j++){
                hash_temp.add(nums[j]);
                if(hash_temp.size()==dis) count++;
            }
        }
        return count;
    }
}