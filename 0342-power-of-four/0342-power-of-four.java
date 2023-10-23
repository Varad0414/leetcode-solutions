class Solution {
    public boolean isPowerOfFour(int n) {
        if(n <= 0){
            return false;
        }

        for(int i=0;i<=15;i++){
            int pof = (int)Math.pow(4,i);

            if(pof == n){
                return true;
            }

            if(pof > n){
                return false;
            }
        }

        return false;
    }
}