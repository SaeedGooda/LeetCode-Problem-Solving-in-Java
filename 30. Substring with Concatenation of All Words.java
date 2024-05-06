class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if(s == null || s.length() == 0 || words == null || words.length == 0){
            return result;
        }
        int wordLength = words[0].length();
        int wordsCount = words.length;
        int totalLength = wordLength * wordsCount;
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.merge(word, 1, Integer::sum);
        }
        
        for(int i = 0 ; i < wordLength ; i++){
            Map<String, Integer> currentCount = new HashMap<>();
            int left = i, right = i;
            int totalWords = 0;
            while(right + wordLength <= s.length()){
                String sub = s.substring(right, right + wordLength);
                right += wordLength;

                if(!wordMap.containsKey(sub)){
                    currentCount.clear();
                    left = right;
                    totalWords = 0;
                    continue;
                }
                currentCount.merge(sub, 1, Integer::sum);
                ++totalWords;

                while(currentCount.get(sub) > wordMap.get(sub)){
                    String removed = s.substring(left, left+wordLength);
                    left += wordLength;
                    currentCount.merge(removed, -1, Integer::sum);
                    --totalWords;
                }

                if(totalWords == wordsCount){
                    result.add(left);
                }
            }
        }
        return result;
    }
}