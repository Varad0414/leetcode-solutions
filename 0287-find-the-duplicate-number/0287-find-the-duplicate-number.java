class Solution {
    public int findDuplicate(int[] nums) {
        // int n = nums.length;
        // int esum = (n*(n+1))/2;
        // int sum = 0;
        // int dupli = nums[0];
        // int cnt = 0;
        // for(int i=0;i<n;i++){
        //     sum += nums[i];
        //     if(dupli == nums[i]){
        //         cnt++;
        //     } 
        // }

        // if(cnt >= 2)
        //     return dupli;
        // // if(esum == sum)
        // //     return nums[0];
        // dupli = (n - (esum - sum));
        // cnt = 0;
        // for(int i=0;i<n;i++){
        //     if(dupli == nums[i]){
        //         cnt++;
        //     }
        // }

        // if(cnt > 1){
        //     return dupli;
        // }
        // else{

        // }

        HashMap<Integer, Integer> map = new HashMap<>();
        int n = 0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
            if(map.get(nums[i]) >= 2){
                n = nums[i];
                break;
            }
        }

        return n;

    }
}