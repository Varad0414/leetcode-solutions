class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0){
            return 0;
        }

        if(nums.length == 1){
            if(nums[0] != val)
                return 1;
            else{
                return 0;
            }
        }

        int i=0,j=0;

        while(nums[j] != val){
            j++;
            if(j >= nums.length)
                break;
        }

        if(j == nums.length-1){
            if(nums[j] == val)
                return nums.length - 1;
            else{
                return nums.length;
            }
        }
        i = j + 1;
        while(i < nums.length){
            if(nums[i] == val)
                i++;
            else{
                if(nums[j] == val){
                    nums[j] = nums[i];
                    nums[i] = val;
                    j++;
                }
                else{
                    j++;
                }
            }
        }

        return j;
    }
}