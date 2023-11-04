class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int minLeft = Integer.MAX_VALUE;
        int maxRight = Integer.MIN_VALUE;

        for(int i=0;i<right.length;i++){
            minLeft = Math.min(minLeft, right[i]);
        }

        for(int i=0;i<left.length;i++){
            maxRight = Math.max(maxRight, left[i]);
        }

        int distLeft = n - minLeft;
        int distRight = maxRight;

        return Math.max(distLeft, distRight);
    }
}