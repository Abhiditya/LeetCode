class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ll = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words[i].length(); j++){
                if(words[i].charAt(j)==x){
                    ll.add(i);
                    break;
                }
            }
        }
        return ll;
    }
}