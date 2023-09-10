class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int h1 = height[left];
            int h2 = height[right];
            int w = right - left;
            int h = Math.min(h1, h2);
            int area = w * h;
            max = Math.max(max, area);

            if (h1 < h2) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}