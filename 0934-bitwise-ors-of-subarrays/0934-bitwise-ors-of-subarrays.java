class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        int n=arr.length;
        int count=0;
        Set<Integer> set= new HashSet<>();
        Set<Integer> prev= new HashSet<>();
        for(int val: arr){
            Set<Integer> cur= new HashSet<>();
            cur.add(val);
            for(int x: prev){
                cur.add(x|val);
            }
            set.addAll(cur);
            prev=cur;
        }
        for(int val: set){
            count++;
        }
        return count;
    }
}