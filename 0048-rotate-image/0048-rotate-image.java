class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i=0;i<n;i++){
            int s=0,j=n-1;
            while(s < j){
                int temp = matrix[i][s];
                matrix[i][s] = matrix[i][j];
                matrix[i][j] = temp;
                s++;
                j--;
            }
        }
    }
}