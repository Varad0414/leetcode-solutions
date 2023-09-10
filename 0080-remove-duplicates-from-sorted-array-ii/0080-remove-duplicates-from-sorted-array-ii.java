class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int i=0;
        int s = 0;
        for(Map.Entry<Integer,Integer> el : map.entrySet()){
            int n = el.getValue();
            if(n == 1){
                nums[i++] = el.getKey();
                s++;
            }
            else{
                for(int j=0;j<2;j++){
                    nums[i++] = el.getKey();
                    s++;
                }
            }
        }

        return s;
    }
}