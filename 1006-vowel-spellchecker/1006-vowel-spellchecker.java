class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        int n = queries.length;
        int m = wordlist.length;
        String[] lowerWordlist = new String[m];
        for (int i = 0; i < m; i++) {
            lowerWordlist[i] = wordlist[i].toLowerCase();
        }
        Set<String> set = new HashSet<>(Arrays.asList(wordlist));
        String[] res = new String[n];

        for (int i = 0; i < n; i++) {
            String q = queries[i];
            String lowerQ = q.toLowerCase();
            if (set.contains(q)) {
                res[i] = q;
            } else {
                boolean flag = false;
                for (int j = 0; j < m; j++) {
                    if (lowerWordlist[j].equals(lowerQ)) {
                        res[i] = wordlist[j];
                        flag = true;
                        break;
                    }
                }
                for (int j = 0; !flag && j < m; j++) {
                    if (wordlist[j].length() != q.length()) res[i]= "";
                    else if (checkStr(lowerWordlist[j], lowerQ)) {
                        res[i] = wordlist[j];
                        flag = true;
                        break;
                    }
                    else if(j == m - 1) res[i] = "";
                }
            }
        }
        return res;
    }

    public boolean checkStr(String word, String query) {
        for (int i = 0; i < word.length(); i++) {
            char c1 = word.charAt(i);
            char c2 = query.charAt(i);
            c1 = Character.toLowerCase(c1);
            c2 = Character.toLowerCase(c2);
            if (c1 != c2 && ("aeiou".indexOf(c1) == -1 || "aeiou".indexOf(c2) == -1))
                return false;
        }
        return true;
    }

}