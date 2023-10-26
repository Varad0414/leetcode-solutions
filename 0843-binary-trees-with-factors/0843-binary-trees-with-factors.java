import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    private static final int MOD = 1000000007;

    public int numFactoredBinaryTrees(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer, Long> dp = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            dp.put(arr[i], 1L);
        }

        for (int i = 1; i < arr.length; i++) {
            long cnt = 0;

            for (int j = 0; j < i; j++) {
                if (arr[i] % arr[j] == 0) {
                    int f = arr[j];
                    int s = arr[i] / arr[j];

                    if (dp.containsKey(s)) {
                        long c1 = dp.get(f);
                        long c2 = dp.get(s);
                        cnt += (c1 * c2) % MOD;
                    }
                }
            }

            dp.put(arr[i], (dp.get(arr[i]) + cnt) % MOD);
        }

        long total = 0;

        for (Map.Entry<Integer, Long> entry : dp.entrySet()) {
            total = (total + entry.getValue()) % MOD;
        }

        return (int) total;
    }
}
