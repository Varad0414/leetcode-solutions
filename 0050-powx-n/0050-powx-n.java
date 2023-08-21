class Solution {
    public double myPow(double x, int n) {
        if (x == 0) {
            return 0; // x^0 is 1 for any non-zero x
        }
        if (n == 0) {
            return 1; // Any x raised to the power of 0 is 1
        }
        
        double ans = 1.0;
        long absN = Math.abs((long) n); // Convert n to long to handle Integer.MIN_VALUE case
        
        while (absN > 0) {
            if (absN % 2 == 1) {
                ans *= x;
            }
            x *= x;
            absN /= 2;
        }
        
        return n < 0 ? 1 / ans : ans;
    }
}