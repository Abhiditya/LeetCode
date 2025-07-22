class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set= new HashSet<>();
        while(!set.contains(n)){
            set.add(n);
            n=sumQ(n);
        }
        if(n==1) return true;
        else return false;
    }

    private int sumQ(int n){
        int sum=0;
        while(n!=0){
            sum+=Math.pow(n%10,2);
            n=n/10;
        }
        return sum;
    } 
}