class Solution {
    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer, Integer> hash= new HashMap<>();
        int n=nums.size();
        int maxF=0;
        int Dom=Moore_Voting(nums);
        for (int num : nums) {
            if(num==Dom){
                maxF++;
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
    public static int Moore_Voting(List<Integer> arr) {
		int e=arr.get(0);
		int vote=1;
		for(int i=1; i<arr.size(); i++) {
			if(arr.get(i)==e) {
				vote++;
			}
			else {
				vote--;
			}
			if(vote==0) {
				e=arr.get(i);
				vote=1;
			}
		}
		return e;
	}
}