class Solution {
    public String reverseWords(String s) {
        String arr[] = s.split(" ");
        String ans = "";
        for(int i=0;i<arr.length;i++){
            StringBuilder str = new StringBuilder(arr[i]);
            str.reverse();
            if(i != arr.length - 1){
                ans += str.toString() + " ";
            }
            else{
                ans += str.toString();
            }
        }

        return ans;
    }
}