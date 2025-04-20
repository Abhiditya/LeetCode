class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer, Integer> hash= new HashMap<>();
        int n=answers.length;
        for(int i=0; i<n; i++){
            hash.put(answers[i], hash.getOrDefault(answers[i], 0)+1);
        }
        int count=0;
        for(int key: hash.keySet()){
            int val=hash.get(key);
            int pair= key+1;
            if(pair>val){
                count+=pair;
            }else{
                int temp= val%pair == 0 ? val/pair : val/pair + 1 ;
                count+=(temp*pair);
            }
        }
        return count;
    }
}