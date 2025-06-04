class Solution {
    public String answerString(String word, int numFriends) {
        int n= word.length();
        if (word == null || n == 0) return "";
        if (numFriends==1) return word;

        char[] chars= word.toCharArray();
        Arrays.sort(chars);
        int max_len= n - numFriends + 1;
        String max= "";

        for (int i=0; i<n; i++) {
            if (word.charAt(i)==chars[chars.length-1]) {
                int si=i, ei=i;
                while (ei<Math.min(n, i+max_len)) {
                    String sub = word.substring(si, ei + 1);
                    if (sub.compareTo(max) > 0) max=sub;
                    ei++;
                }
            }
        }
        return max;
    }
}