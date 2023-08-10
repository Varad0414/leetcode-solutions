class Solution {
    public static int[] previousSmallest(int[] arr){
        int ps[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i])
                s.pop();
            if(s.isEmpty()){
                ps[i] = -1;
            }
            else{
                ps[i] = s.peek();
            }

            s.push(i);
        }

        return ps;
    }

    public static int[] nextSmallest(int[] arr){
        int ns[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        for(int i= arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i])
                s.pop();
            if(s.isEmpty()){
                ns[i] = arr.length;
            }
            else{
                ns[i] = s.peek();
            }

            s.push(i);
        }

        return ns;
    }

    public int largestRectangleArea(int[] arr) {
        int maxArea = 0;
        if(arr.length == 1){
            return arr[0];
        }
        int ps[] = previousSmallest(arr);
        int ns[] = nextSmallest(arr);

        for(int i=0;i<arr.length;i++){
            int area = (ns[i] - ps[i] - 1) * arr[i];
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}