class Solution {
    public String answerString(String word, int numFriends) {
        int n= word.length();
        if (word == null || n == 0) return "";
        if (numFriends==1) return word;

        int max_len= n - numFriends + 1;
        String max= "";

        for (int i = 0; i < n; i++) {
            int min = Math.min(i + max_len, n);
            String sub = word.substring(i, min);
            if (sub.compareTo(max) > 0) {
                max = sub;
            }
        }
        return max;
    }
}