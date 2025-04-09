class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] ans= new int[code.length];
        int n=code.length;
        for(int i=0; i<n; i++){
            if(k>0){
                for(int j=1; j<=k; j++){
                    ans[i]+=code[(i + j) % n];
                }
            }else if(k==0){
                ans[i]=0;
            }else{
                for(int j = 1; j <= -k; j++) {
                    ans[i] += code[(i - j + n) % n];
                }
            }
        }
        return ans;
    }
}