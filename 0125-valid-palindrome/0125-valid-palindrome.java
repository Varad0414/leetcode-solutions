class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))){
                str += s.charAt(i) + "";
            }
        }

        if(str.equalsIgnoreCase(new StringBuffer(str).reverse().toString())){
            return true;
        }

        return false;
    }
}