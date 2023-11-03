class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> al = new ArrayList<>();
        int ind = 0;

        for(int i=1;i<=n;i++){
            if(ind == target.length)
                break;
            if(i == target[ind]){
                al.add("Push");
                ind++;
            }
            else{
                al.add("Push");
                al.add("Pop");
            }
        }

        return al;
    }
}