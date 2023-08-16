class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int one = 0;
        int two = 0;
        int zero = 0;

        for(int i=0;i<n;i++){
            if(nums[i] == 1)
                one++;
            if(nums[i] == 2)
                two++;
            if(nums[i] == 0)
                zero++;
        }
        int ind = 0;
        while(zero-->0){
            nums[ind++] = 0;
        }

        while(one-->0){
            nums[ind++] = 1;
        }

        while(two-->0){
            nums[ind++] = 2;
        }

    }
}