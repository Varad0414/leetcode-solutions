class Solution {
    public int bestClosingTime(String customers) {
        int yes = 0;
        int no = 0;
        int leftNo = 0;
        int ind = -1;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<customers.length();i++){
            char c = customers.charAt(i);
            if(c == 'Y'){
                yes++;
            }
            else{
                no++;
            }
        }

        if(no == 0){
            return customers.length();
        }
        else if(yes == 0){
            return 0;
        }

        int penalties = yes;
        for(int i=0;i<customers.length();i++){
            penalties = yes + leftNo;
            if(penalties < min){
                min = penalties;
                ind = i;
            }

            char c = customers.charAt(i);
            if(c == 'Y'){
                yes--;
            }
            else{
                leftNo++;
            }
        }

        penalties = yes + leftNo;
        if(penalties < min){
            min = penalties;
            ind = customers.length();
        }

        return ind;
    }
}