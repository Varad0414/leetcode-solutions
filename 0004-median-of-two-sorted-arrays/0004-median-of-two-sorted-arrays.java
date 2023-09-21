class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        if (m > n) {
            // Ensure nums1 is the smaller array to simplify the logic
            return findMedianSortedArrays(nums2, nums1);
        }

        int left = 0, right = m;
        int partitionX, partitionY;
        int maxX, maxY, minX, minY;

        while (left <= right) {
            partitionX = (left + right) / 2;
            partitionY = (m + n + 1) / 2 - partitionX;

            maxX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            maxY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            minX = (partitionX == m) ? Integer.MAX_VALUE : nums1[partitionX];
            minY = (partitionY == n) ? Integer.MAX_VALUE : nums2[partitionY];

            if (maxX <= minY && maxY <= minX) {
                if ((m + n) % 2 == 0) {
                    return (Math.max(maxX, maxY) + Math.min(minX, minY)) / 2.0;
                } else {
                    return Math.max(maxX, maxY);
                }
            } else if (maxX > minY) {
                right = partitionX - 1;
            } else {
                left = partitionX + 1;
            }
        }
        return -1;
    }


}