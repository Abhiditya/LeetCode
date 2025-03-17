class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashMap<Character, Integer> hash= new HashMap<>();
        int len=0;
        int si=0;
        int ei=0;
        while(ei<n){
            //grow
            hash.put(s.charAt(ei), hash.getOrDefault(s.charAt(ei), 0) + 1);
            
            //shrink
            while(hash.get(s.charAt(ei)) > 1){
                hash.put(s.charAt(si), hash.get(s.charAt(si)) - 1);
                si++;
            }
            //update
            len = Math.max(len, ei - si + 1);
            ei++;
        }
        return len;
    }
}