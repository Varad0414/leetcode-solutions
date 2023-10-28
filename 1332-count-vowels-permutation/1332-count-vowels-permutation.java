public class Solution {
    public int countVowelPermutation(int n) {
        long prevA = 1, prevE = 1, prevI = 1, prevO = 1, prevU = 1;
        int mod = 1000000007; 

        for (int length = 2; length <= n; length++) {
            long nextA = (prevE + prevU + prevI) % mod; // 'a' can be preceded by 'e', 'u', or 'i'
            long nextE = (prevA + prevI) % mod; // 'e' can be preceded by 'a' or 'i'
            long nextI = (prevE + prevO) % mod; // 'i' can be preceded by 'e' or 'o'
            long nextO = prevI; // 'o' can only be preceded by 'i'
            long nextU = (prevO + prevI) % mod; // 'u' can be preceded by 'o' or 'i'
            prevA = nextA;
            prevE = nextE;
            prevI = nextI;
            prevO = nextO;
            prevU = nextU;
        }

        return (int) ((prevA + prevE + prevI + prevO + prevU) % mod);
    }
}