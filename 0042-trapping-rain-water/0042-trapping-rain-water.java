class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int water = 0;
        int max = 0;
        
        for(int i=0;i<n;i++){
            if(i == 0){
                left[i] = height[i];
                max = Math.max(max, height[i]);
                continue;
            }

            max = Math.max(max, height[i]);
            left[i] = max;
        }

        max = 0;
        for(int i=n-1;i>=0;i--){
            if(i == n-1){
                right[i] = height[i];
                max = Math.max(max, height[i]);
                continue;
            }
            max = Math.max(max, height[i]);
            right[i] = max;
        }

        for(int i=0;i<n;i++){
            int sum = (Math.min(left[i], right[i]) - height[i]);
            water += sum;
        }
        

        return water;
    }
}