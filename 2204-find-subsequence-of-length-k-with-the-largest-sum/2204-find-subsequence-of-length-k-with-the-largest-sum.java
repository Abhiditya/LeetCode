class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        HashMap<Integer, Integer> hash= new HashMap<>();
        int n=nums.length;
        List<Integer> list =Arrays.stream(nums).boxed().collect(Collectors.toList());
        Arrays.sort(nums);
        for(int i=0; i<n-k; i++){
            list.remove(Integer.valueOf(nums[i]));
        }
        int[] result = list.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}