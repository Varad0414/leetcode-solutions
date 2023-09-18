class Solution {
    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.isEmpty() || words == null || words.length == 0) {
            return result;
        }

        int wordLength = words[0].length();
        int totalLength = wordLength * words.length;
        int sLength = s.length();

        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i < wordLength; i++) {
            int left = i;
            int right = i;
            Map<String, Integer> currentMap = new HashMap<>();
            int count = 0;

            while (right + wordLength <= sLength) {
                String word = s.substring(right, right + wordLength);
                right += wordLength;

                if (wordFrequency.containsKey(word)) {
                    currentMap.put(word, currentMap.getOrDefault(word, 0) + 1);
                    count++;

                    while (currentMap.getOrDefault(word, 0) > wordFrequency.getOrDefault(word, 0)) {
                        String leftWord = s.substring(left, left + wordLength);
                        left += wordLength;
                        currentMap.put(leftWord, currentMap.get(leftWord) - 1);
                        count--;
                    }

                    if (count == words.length) {
                        result.add(left);
                    }
                } else {
                    currentMap.clear();
                    count = 0;
                    left = right;
                }
            }
        }

        return result;
    }
}