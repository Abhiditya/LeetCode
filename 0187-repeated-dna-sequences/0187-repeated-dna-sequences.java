class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        // int n=s.length();
        // List<String> ll= new ArrayList<>();
        // HashMap<String, Integer> hash= new HashMap<>();
        // for(int i=0; i<=n-10; i++){
        //     hash.put(s.substring(i,i+10), hash.getOrDefault(s.substring(i,i+10), 0)+1);
        //     if(hash.get(s.substring(i,i+10))>1 && !ll.contains(s.substring(i,i+10))){
        //         ll.add(s.substring(i,i+10));
        //     }
        // }
        // return ll;

        //optimized method
        HashSet<String> check = new HashSet<>();
        HashSet<String> repeated = new HashSet<>();

        for (int i = 0; i <= s.length() - 10; i++) {
            String str = s.substring(i, i + 10);
            if (!check.add(str)) {
                repeated.add(str);
            }
        }
        return new ArrayList<>(repeated);
    }
}