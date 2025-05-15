class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> ans= new ArrayList<>();
        for(int i=0; i<words.length-1; i++){
            if(groups[i]!=groups[i+1]){
                ans.add(words[i]);
            }
        }
        ans.add(words[words.length-1]);
        return ans;
    }
}