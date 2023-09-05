class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> s = new Stack<>();
        for(String str: tokens){
            if(str.equals("+") || str.equals("*") || str.equals("/") || str.equals("-")){
                int a = Integer.valueOf(s.pop());
                int b = Integer.valueOf(s.pop());
                if(str.equals("+")){
                    s.push(Integer.toString(a+b));
                }
                else if(str.equals("*")){
                    s.push(Integer.toString(a*b));
                }
                else if(str.equals("/")){
                    s.push(Integer.toString(b/a));
                }
                else if(str.equals("-")){
                    s.push(Integer.toString(b-a));
                }
            }
            else{
                s.push(str);
            }
        }

        return Integer.valueOf(s.pop());
    }
}