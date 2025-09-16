class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        int n=nums.length;
        List<Integer> res = new ArrayList<>();
        for (int num : nums) {
            res.add(num);
        }
        int si=0;
        while(si<res.size()-1){
            int a=res.get(si);
            int b=res.get(si+1);
            int gcd= gcd(a,b);
            if(gcd>1){
                res.remove(si+1);
                res.set(si,lcm(a,b,gcd));
                if(si>0) si--;
            }
            else si++;
        }
        return res;
    }
    public int lcm(int a, int b, int gcd) {
        return (a / gcd) * b; 
    }
    public int gcd(int a, int b) {
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}