class Solution {
    // public int minOperations(int[] nums, int x) {
    //     int i = 0,j = nums.length - 1;
    //     int cnt = 0;
    //     while(i < j){
    //         int d1 = x - nums[i];
    //         int d2 = x - nums[j];
    //         if(d1 < d2 && d1 >= 0){
    //             x = d1;
    //             i++;
    //             cnt++;
    //         }
    //         else if(d2 < d1 && d2 >= 0){
    //             x = d2;
    //             j--;
    //             cnt++;
    //         }

    //         if(x == 0){
    //             return cnt;
    //         }

    //         if(x < 0){
    //             return -1;
    //         }
    //     }

    //     return -1;
    // }

    public int minOperations(int[] nums, int x) {
        int target = -x, n = nums.length;
        for (int num : nums) target += num;
        
        if (target == 0) return n;
        
        int maxLen = 0, curSum = 0, left = 0;
        
        for (int right = 0; right < n; ++right) {
            curSum += nums[right];
            while (left <= right && curSum > target) {
                curSum -= nums[left];
                left++;
            }
            if (curSum == target) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        
        return maxLen != 0 ? n - maxLen : -1;
    }
}