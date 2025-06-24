class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        HashSet<Integer> hash= new HashSet<>();
        int n=nums.length;
        for(int j=0; j<n; j++){
            if(nums[j]==key){
                for(int i=Math.max(0,j-k); i<Math.min(n,j+k+1); i++){
                    if(Math.abs(i-j)<=k) hash.add(i);
                }
            }
        }
        List<Integer> ll= new ArrayList<>();
        for(int val: hash){
            ll.add(val);
        }
        Collections.sort(ll);
        return ll;
    }
}