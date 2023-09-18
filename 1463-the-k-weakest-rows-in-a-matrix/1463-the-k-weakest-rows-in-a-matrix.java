class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
    List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>();

    for (int i = 0; i < mat.length; i++) {
        int cnt = 0;
        for (int j = 0; j < mat[i].length; j++) {
            if (mat[i][j] == 1) {
                cnt++;
            } else {
                break; // Since the matrix is sorted, we can exit early when encountering 0.
            }
        }
        entryList.add(new java.util.AbstractMap.SimpleEntry<>(i, cnt));
    }

    // Sort the list of entries based on the values (weakness count)
    entryList.sort((entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue()));

    int[] ans = new int[k];
    for (int i = 0; i < k; i++) {
        ans[i] = entryList.get(i).getKey();
    }

    return ans;
}
}