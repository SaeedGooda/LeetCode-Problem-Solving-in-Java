class Solution {
    public double helper(double x, int n){
        if(n == 0) return 1;
        double result = helper(x, n/2);
        result = result * result;
        return (n % 2 == 0)? result : x * result; 
    }
    public double myPow(double x, int n) {
        double result = helper(x, n);
        return n >= 0 ? result : 1 / result;
    }
}