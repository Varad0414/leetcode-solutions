class Solution {
    public void nextPermutation(int[] nums) {
        if(edgeCase(nums)){
            int i = 0;
            int j = nums.length-1;
            while(i<j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        else{
            int ind1 = -1;
            int ind2 = -1;
            for(int i=nums.length-2;i>=0;i--){
                if(nums[i] < nums[i+1]){
                    ind1 = i;
                    break;
                }
            }

            for(int i=nums.length-1;i>=0;i--){
                if(nums[ind1] < nums[i]){
                    ind2 = i;
                    break;
                }
            }

            int temp = nums[ind1];
            nums[ind1] = nums[ind2];
            nums[ind2] = temp;

            int i = ind1 + 1;
            int j = nums.length-1;

            while(i < j){
                int temp1 = nums[i];
                nums[i] = nums[j];
                nums[j] = temp1;
                i++;
                j--;
            }
        }
    }

    public static boolean edgeCase(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] < arr[i+1]){
                return false;
            }
        }

        return true;
    }
}