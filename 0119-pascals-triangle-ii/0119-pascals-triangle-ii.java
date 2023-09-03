class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> al = new ArrayList<>();
        al.add(1);
        for(int i=1;i<=rowIndex;i++){
            al.add(ncr(rowIndex,i));
        }

        return al;
    }

    public static int ncr(int n, int r){
        long res = 1;
        for(int i=0;i<r;i++){
            res *= (n-i);
            res/= (i+1);
        }
        return (int)res;
    }
}