class Solution {
    public int majorityElement(int[] nums) {
        int el = nums[0];
        int cnt = 1;
        for(int i=1;i<nums.length;i++){
            if(el == nums[i]){
                cnt++;
            }
            else{
                cnt--;
            }

            if(cnt == 0){
                el = nums[i];
                cnt = 1;
            }
        }

        return el;
    }
}