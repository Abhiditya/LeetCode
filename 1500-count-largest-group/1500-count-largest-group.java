class Solution {
    public int countLargestGroup(int n) {
        int[] arr = new int[37];
        int max=0;
        for (int i = 1; i <= n; i++) {
            int sum = sum(i);
            arr[sum]++;
            max = Math.max(max, arr[sum]);
        }
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) count++;
        }
        return count;
    }

    private int sum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}