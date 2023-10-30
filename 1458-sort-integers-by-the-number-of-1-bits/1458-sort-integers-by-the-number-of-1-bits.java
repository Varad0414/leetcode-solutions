class Solution {
    public int[] sortByBits(int[] arr) {
        int bits[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int n = arr[i];
            int cnt = 0;
            while(n > 0){
                if((n & 1) != 0){
                    cnt++;
                }
                n = n >> 1;
            }
            bits[i] = cnt;
        }

        for(int i=0;i<arr.length - 1;i++){
            for(int j=0;j<arr.length - i - 1;j++){
                if(bits[j] == bits[j+1]){
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
                else if(bits[j] > bits[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;

                        temp = bits[j];
                        bits[j] = bits[j + 1];
                        bits[j + 1] = temp;
                }
            }
        }

        return arr;
    }
}

