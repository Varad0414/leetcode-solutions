class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length == 1){
            return true;
        }

        if(nums[0] > nums[1]){
            for(int i=1;i<nums.length - 1;i++){
                if(nums[i] < nums[i+1]){
                    return false;
                }
                else if(nums[i] == nums[i+1]){
                    continue;
                }
            }
        }
        else if(nums[0] == nums[1]){
            boolean less = false, great = false;
            for(int i=1;i<nums.length-1;i++){
                if(nums[i] < nums[i+1]){
                    great = true;
                }
                else if(nums[i] > nums[i+1]){
                    less = true;
                }
            }

            if(great && less){
                return false;
            }
            if(!great && !less){
                return true;
            }
        }
        else{
            for(int i=1;i<nums.length - 1;i++){
                if(nums[i] > nums[i+1]){
                    return false;
                }
                else if(nums[i] == nums[i+1]){
                    continue;
                }
            }
        }

        return true;
    }
}