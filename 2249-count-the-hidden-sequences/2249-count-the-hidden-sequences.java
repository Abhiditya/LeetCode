class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long current=0, max=0, min=0;
        for (int diff : differences) {
            current += diff;
            max = Math.max(max, current);
            min = Math.min(min, current);
        }
        long range= max-min;
        long ans=(upper - lower + 1) - range;
        return ans > 0 ? (int)ans : 0;
    }
}