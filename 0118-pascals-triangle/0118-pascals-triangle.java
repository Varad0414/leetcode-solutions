class Solution {
    public static ArrayList<Integer> getRow(int row){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        int num = 1;
        for(int i=1;i<row;i++){
            num = num * (row - i);
            num = num / i;
            al.add(num); 
        }

        return al;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> al = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            al.add(getRow(i));
        }

        return al;
    }
}