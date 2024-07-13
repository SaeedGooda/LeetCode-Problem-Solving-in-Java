class Solution {
    public static int getIndex(String[] keyboard, char c){
        for(int i = 0 ; i < keyboard.length ; i++){
            if(keyboard[i].indexOf(c) != -1){
                return i;
            }
        }
        return -1;
    }
    public String[] findWords(String[] words) {
        String[] keyboard = new String[]{"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        List<String> result = new ArrayList<>();
        for(String word: words){
            String lowerWord = word.toLowerCase();
            int index = getIndex(keyboard, lowerWord.charAt(0));
            int count = 0;
            for(char ch: lowerWord.toCharArray()){
                int newIndex = getIndex(keyboard, ch);
                if(newIndex != index){
                    break;
                }
                count++;
            }
            if(count == word.length()){
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }
}