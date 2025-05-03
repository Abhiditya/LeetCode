class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int n=tops.length;
        int T=0, B=0;
        int top=max(tops);
        int bottom=max(bottoms);
        for(int i=0; i<n; i++){
            if(tops[i]!=top) {
                if(bottoms[i]!=top){
                    B=-1;
                    break;
                }
                else{
                    B++;
                }
            }
        }
        for(int i=0; i<n; i++){
            if(bottoms[i]!=bottom) {
                if(tops[i]!=bottom){
                    T=-1;
                    break;
                }
                else{
                    T++;
                }
            }
        }
        if(B==-1 && T==-1)  return -1;
        else if(B==-1 || T==-1) return  B > 0 ? B : T ;
        else {
            return Math.min(B,T);
        }
    }
    public int max(int[] nums){
        HashMap<Integer, Integer> hash= new HashMap<>();
        int max=0;
        int max_val=nums[0];
        for(int i=0; i<nums.length; i++){
            int freq=hash.getOrDefault(nums[i],0)+1;
            hash.put(nums[i],freq);
            if(max<freq){
                max=freq;
                max_val=nums[i];
            }
        }
        return max_val;
    }
}