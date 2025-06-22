class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n=s.length();
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; ){
            int len=k;
            while(len>0){
                if(i<n){
                    sb.append(s.charAt(i));
                    i++;
                }else{
                    sb.append(fill);
                }
                len--;
            }
            list.add(sb.toString());
            sb.setLength(0);
        }
        String[] arr = list.toArray(new String[0]);
        return arr;
    }
}