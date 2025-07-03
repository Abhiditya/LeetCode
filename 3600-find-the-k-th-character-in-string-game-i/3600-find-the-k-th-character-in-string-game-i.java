class Solution {
    public char kthCharacter(int k) {
        String str="a";
        while (str.length()<=k) {
            str = str.concat(inc(str)); 
        }
        return str.charAt(k-1);
    }

    private String inc(String str){
        int n=str.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            sb.append((char)(str.charAt(i) + 1));
        }
        return sb.toString();
    }
}