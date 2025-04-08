class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        int i = 0;

        while (i < nums.length) {
            Set<Integer> set = new HashSet<>();
            boolean foundDuplicate = false;

            for (int j = i; j < nums.length; j++) {
                if (set.contains(nums[j])) {
                    foundDuplicate = true;
                    break;
                }
                set.add(nums[j]);
            }

            if (foundDuplicate) {
                count++;
                i += 3; // remove first 3
            } else {
                break;
            }
        }

        return count;
    }

}