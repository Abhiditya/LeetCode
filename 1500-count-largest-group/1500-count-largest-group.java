class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, List<Integer>> ll = new HashMap<>();
        
        int max=0;
        for(int i=1; i<=n; i++){
            int sum=sum(i);
            ll.putIfAbsent(sum, new ArrayList<>());
            ll.get(sum).add(i);
            max = ll.get(sum).size() > max ? ll.get(sum).size() : max ;
        }
        int count=0;
        for (Integer key : ll.keySet()){
            if(ll.get(key).size()==max) count++;
        }
        return count;
    }

    private int sum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}