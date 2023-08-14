class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> al = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        al.add(list);
        if(numRows == 1){
            return al;
        }

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(1);
        al.add(list2);
        if(numRows == 2){
            return al;
        }

        for(int i=2;i<numRows;i++){
            List<Integer> list3 = new ArrayList<>();

            for(int j=0;j<i+1;j++){
                int n1 = 0;
                if((j-1) < 0){
                    n1 = 0;
                }
                else{
                    n1 = al.get(i-1).get(j-1);
                }
                int n2 = 0;
                if(j >= al.get(i-1).size()){
                    n2 = 0;
                }
                else{
                    n2 = al.get(i-1).get(j);
                }
                int sum = n1 + n2;
                list3.add(sum);
            }

            al.add(list3);
        }
        return al;
    }
}