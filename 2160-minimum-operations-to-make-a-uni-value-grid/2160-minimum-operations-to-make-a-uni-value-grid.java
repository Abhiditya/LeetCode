class Solution {
    public int minOperations(int[][] grid, int x) {
        int n=grid.length;
        int m=grid[0].length;
        int[] arr= new int[n*m];
        int k=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[k++]=grid[i][j];
            }
        }
        Arrays.sort(arr);
        int mid=arr.length/2;
        int result=0;
        for(int i=0; i<arr.length; i++){
            while(arr[i]<arr[mid]){
                arr[i]+=x;
                result++;
            }
            while(arr[i]>arr[mid]){
                arr[i]-=x;
                result++;
            }
        }
        for(int val: arr){
            if(val!=arr[mid]){
                return -1;
            }
        }
        return result;
    }
}