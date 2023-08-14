class Solution {
    public void setZeroes(int[][] matrix) {
        boolean arr[][] = new boolean[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    arr[i][j] = true;
                }
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0 && arr[i][j] == true){
                    int s = 0;
                    while(s < matrix.length){
                        matrix[s][j] = 0;
                        s++;
                    }
                    s = 0;
                    while(s < matrix[0].length){
                        matrix[i][s] = 0;
                        s++;
                    }
                }
            }
        }
    }
}