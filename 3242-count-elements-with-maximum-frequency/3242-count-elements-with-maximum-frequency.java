class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> hash = new  HashMap<>();
        int maxF=0;
        for(int i=0; i<nums.length; i++){
            hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);
            maxF = Math.max(maxF, hash.get(nums[i]));
        }
        int count = 0;
        for(int val : hash.values()){
            if(maxF == val) count++;
        }
        return count*maxF;
    }
}