class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr = text.split(" ");
        int n= arr.length;
        int count= 0;
        char[] freq = new char[26];
        for(char ch: brokenLetters.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i=0; i<n; i++){
            count++;
            for(char ch: arr[i].toCharArray()){
                if(freq[ch-'a']!=0){
                    count--;
                    break;
                } 
            }
        }
        return count;
    }
}