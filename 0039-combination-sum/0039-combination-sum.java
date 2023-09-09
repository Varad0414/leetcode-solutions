class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Sort the input to handle duplicates properly
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current)); // Found a valid combination
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) {
                break; // Stop if the current candidate is larger than the remaining target
            }

            current.add(candidates[i]); // Choose the current candidate
            backtrack(candidates, target - candidates[i], i, current, result); // Recurse with reduced target
            current.remove(current.size() - 1); // Backtrack
        }
    }

}