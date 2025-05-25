class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String, Integer> hash= new HashMap<>();
        int n=words.length;
        int count=0;
        boolean flag=false;
        for(int i=0; i<n; i++){
            hash.put(words[i],hash.getOrDefault(words[i],0)+1);
        }
        for(String word : hash.keySet()){
            String rev=rev(word);
            if (isSym(word)) {
                int freq = hash.get(word);
                count += (freq / 2) * 4;
                //odd freq
                if (freq % 2 == 1) {
                    flag = true;
                }
            } else if (hash.containsKey(rev)) {
                int min = Math.min(hash.get(word), hash.get(rev));
                count += min * 4;
                hash.put(word, hash.get(word) - min);
                hash.put(rev, hash.get(rev) - min);
            }
        }
        if(flag) count+=2;
        return count;
    }

    public boolean isSym(String str){
    if(str.charAt(0)==str.charAt(1)) return true;
    return false;
    }

    public String rev(String str){
        return ""+str.charAt(1)+str.charAt(0);
    }
}