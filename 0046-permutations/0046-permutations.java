class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> al = new ArrayList<>();

        if(nums.length == 1){
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(nums[0]);
            al.add(arr);
            return al;
        }
        // if(edgeCase(nums)){
        Arrays.sort(nums);
        // }

        ArrayList<Integer> a = new ArrayList<>();
        for(int i=nums.length-1;i>=0;i--){
            a.add(nums[i]);
        }
        al.add(a);

        int n = factorial(nums.length);

        for(int z=0;z<n-1;z++){
            ArrayList<Integer> arr = new ArrayList<>();

            for(int i=0;i<nums.length;i++){
                arr.add(nums[i]);
            }
            al.add(arr);

            int i1 = -1;
            int i2 = -1;

            for(int i=nums.length-2;i>=0;i--){
                if(nums[i] < nums[i+1]){
                    i1 = i;
                    break;
                }
            }

            for(int i=nums.length-1;i>=0;i--){
                if(nums[i1] < nums[i]){
                    i2 = i;
                    break;
                }
            }

            int temp = nums[i1];
            nums[i1] = nums[i2];
            nums[i2] = temp;

            int i=i1+1;
            int j=nums.length-1;

            while(i < j){
                int temp1 = nums[i];
                nums[i] = nums[j];
                nums[j] = temp1;
                i++;
                j--;
            }
        }


        return al;

    }

    public static boolean edgeCase(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] < arr[i+1]){
                return false;
            }
        }

        return true;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}