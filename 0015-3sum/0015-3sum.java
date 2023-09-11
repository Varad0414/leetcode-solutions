class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> al = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i > 0 && nums[i-1] == nums[i]) continue;
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k){
                int sum = nums[i] + nums[k] + nums[j];
                if(sum > 0){
                    k--;
                }
                else if(sum < 0){
                    j++;
                }
                else{
                    List<Integer> a = new ArrayList<>();
                    a.add(nums[i]);
                    a.add(nums[j]);
                    a.add(nums[k]);
                    al.add(a);

                    j++;
                    k--;

                    while(j < k && nums[j-1] == nums[j]) j++;
                    while(j < k && nums[k+1] == nums[k]) k--;
                }
            }
        }

        return al;
    }
}