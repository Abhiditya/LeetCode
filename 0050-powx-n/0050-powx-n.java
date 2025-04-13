class Solution {
    public double myPow(double a, int n) {
        if(n>=0){
            return pow(a,n);
        }
        else{
            n=Math.abs(n);
            return 1/pow(a,n);
        }
    }

    public static double pow(double a, int n) {
		if (n == 0) {
			return 1;
		}
		double ans=pow(a,n/2);
		ans=ans*ans;
		if(n%2!=0) {
			ans*=a;
		}
		return ans;
	}
}