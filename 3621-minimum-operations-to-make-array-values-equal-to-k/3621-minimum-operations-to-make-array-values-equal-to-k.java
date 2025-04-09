class Solution {
    public int minOperations(int[] nums, int k) {
        HashSet<Integer> set= new HashSet<>();
        int count=0;
        int flag=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=k){
                flag=1;
            }
            if(nums[i]<k)
            return -1;
        }
        if(flag==0) return 0;
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        for(int key: set){
            if(key>k) count++;
        }
        if(count==0)  return -1;
        return count;
    }
}