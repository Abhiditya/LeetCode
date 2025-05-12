class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashSet<Integer> set = new HashSet<>();
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
        int[] array = new int[set.size()];
        int i = 0;
        for (int num : set) {
            array[i++] = num;
        }
        Arrays.sort(array);
        return array;
    }
}