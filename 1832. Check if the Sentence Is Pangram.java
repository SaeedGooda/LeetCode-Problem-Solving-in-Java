class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26){
            return false;
        }
        Set<Character> englishAlphabets = new HashSet<>();
        for(char ch: sentence.toCharArray()){
            englishAlphabets.add(ch);
            if(englishAlphabets.size() == 26){
                return true;
            }
        }
        return englishAlphabets.size() == 26;
    }
}