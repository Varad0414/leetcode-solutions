class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length == 1){
            return nums;
        }
        int n = nums.length;
        int i=0,j=n-1;
        while(j >= i){
            if(nums[j] % 2 == 0){
                if(nums[i] % 2 != 0){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    i++;
                    j--;
                }
                else{
                    i++;
                }
            }
            else{
                j--;
            }
        }

        return nums;
    }
}