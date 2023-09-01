class Solution {
    public int[] countBits(int n) {
        int arr[] = new int[n+1];
        arr[0] = 0;
        for(int i=1;i<=n;i++){
            String str = Integer.toBinaryString(i);
            int cnt = 0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j) == '1'){
                    cnt++;
                }
            }
            arr[i] = cnt;
        }

        return arr;
    }
}