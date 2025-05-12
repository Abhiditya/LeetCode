class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> set = new HashSet<>();
        int count=0;
        int temp=0;
        for(int i=0; i<digits.length; i++){
            for(int j=0; j<digits.length; j++){
                if(i!=j && digits[i]!=0)
                for(int k=0; k<digits.length; k++){
                    if(i!=k && j!=k){
                        temp= digits[i]*100+digits[j]*10+digits[k];
                        if(temp%2==0){
                            set.add(temp);
                        }
                    }
                }
            }
        }
        return set.size();
    }
}