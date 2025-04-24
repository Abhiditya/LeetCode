class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> hash= new HashSet<>();
        int n=nums.length;
        for(int i=0; i<n; i++){
            hash.add(nums[i]);
        }
        int dis=hash.size();
        HashMap <Integer, Integer> map = new HashMap <>() ; 
        int si=0;
        int count=0;
        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1) ;
            while(map.size() == dis){
                count += n-i ;
                map.put(nums[si], map.get(nums[si])-1 ) ;
                if(map.get(nums[si]) == 0){
                    map.remove(nums[si]) ; 
                }
                si++ ; 
            }
        }
        return count;
    }
}