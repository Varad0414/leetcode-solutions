class Solution {
    public boolean winnerOfGame(String colors) {
        int n = colors.length();
        int countA = 0;
        int countB = 0;

        for (int i = 0; i < n - 2; i++) {
            if (colors.charAt(i) == 'A' && colors.charAt(i + 1) == 'A' && colors.charAt(i + 2) == 'A') {
                countA++;
            } else if (colors.charAt(i) == 'B' && colors.charAt(i + 1) == 'B' && colors.charAt(i + 2) == 'B') {
                countB++;
            }
        }

        return countA > countB;
    }

}