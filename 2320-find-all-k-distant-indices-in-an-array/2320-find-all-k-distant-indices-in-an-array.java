class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> hash= new ArrayList<>();
        int n=nums.length;
        int r=0;
        for(int j=0; j<n; j++){
            if(nums[j]==key){
                int l=Math.max(r,j-k);
                r=Math.min(n,j+k+1);
                for(int i=l; i<r; i++){
                    hash.add(i);
                }
            }
        }
        return hash;
    }
}