class Solution {
    public boolean isSubsequence(String t, String s) {
        if (t.length() == 0) return true;
        if (s.length() == 0) return false;
        int si = s.indexOf(t.charAt(0));
        int ei = si+1;
        int idx = 1;
        if(si == -1) return false;
        while( ei < s.length() && idx < t.length() ){
            int ch = s.charAt(ei);
            if( ch == t.charAt(0) && ch != t.charAt(idx)) {
                si = ei;
                idx = 1;
            }else if( ch == t.charAt(idx) ) {
                idx++;
            }
            ei++;
        }
        if( idx == t.length() ) return true;
        return false;
    }
}