class Solution {
    public String maskPII(String s) {
        String masked = "";
        if(s.contains("@")){
            String arr[] = s.split("@");
            String first = arr[0].charAt(0) + "";
            String last = arr[0].charAt(arr[0].length() - 1) + "";
            String domain = arr[1].toLowerCase();
            masked = first.toLowerCase() + "*****" + last.toLowerCase() + "@" + domain;
        }
        else{
            String num = "";
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '(' || s.charAt(i) == ')' || s.charAt(i) == ' '){
                    continue;
                }
                else{
                    num += s.charAt(i) + "";
                }
            }

            if(num.length() == 10){
                masked = "***-***-" + num.substring(num.length() - 4, num.length());
            }
            else{
                String code = num.substring(0,num.length() - 10);
                masked += "+";
                for(int i=0;i<code.length();i++){
                    masked += "*";
                }
                masked += "-***-***-" + num.substring(num.length() - 4, num.length());
            }
        }

        return masked;
    }
}