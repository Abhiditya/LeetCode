class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candy= new int[n];
        for(int i=1; i<n; i++){
            if(ratings[i-1]<ratings[i]){
                candy[i]=candy[i-1]+1;
            }
        }
        for(int i=n-2; i>=0; i--){
            if(ratings[i]>ratings[i+1]){
                candy[i]=Math.max(candy[i+1]+1,candy[i]);
            }
        }
        int count=0;
        for(int i=0; i<n; i++){
            count+=candy[i];
        }
        return count+n;
    }
}