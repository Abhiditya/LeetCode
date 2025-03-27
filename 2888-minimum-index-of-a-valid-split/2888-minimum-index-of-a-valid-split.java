class Solution {
    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer, Integer> hash= new HashMap<>();
        int n=nums.size();
        int maxF=0;
        int Dom=nums.get(0);
        for (int num : nums) {
            hash.put(num, hash.getOrDefault(num, 0) + 1);
            if(maxF<hash.get(num)){
                Dom=num;
                maxF=hash.get(num);
            }
        }
        int f1=0, f2=maxF;
        for(int i=0; i<n; i++){
            if(nums.get(i)==Dom){
                f1++;
                f2--;
            }
            if(f1 * 2 > (i + 1) && f2 * 2 > (n - (i + 1))){
                return i;
            }
        }
        return -1;
    }
}