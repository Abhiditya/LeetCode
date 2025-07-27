class Solution {
    public int countHillValley(int[] nums) {
        int n=nums.length;
        int hill=0, val=0;
        List<Integer> ll= new ArrayList<>();
        for(int i=0; i<n-1; i++){
            if(nums[i]!=nums[i+1]) ll.add(nums[i]);
        }
        ll.add(nums[n-1]);
        for(int i=1; i<ll.size()-1; i++){
            if(ll.get(i)<ll.get(i-1) && ll.get(i)<ll.get(i+1)){
                val++;
            }else if(ll.get(i)>ll.get(i-1) && ll.get(i)>ll.get(i+1)){
                hill++;
            }
        }
        return val+hill;
    }
}