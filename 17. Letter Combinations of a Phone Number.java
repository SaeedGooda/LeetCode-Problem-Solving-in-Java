class Solution {
    Map<Character, String> map = Map.of(
            '2', "abc",
            '3', "def",
            '4', "ghi",
            '5', "jkl",
            '6', "mno",
            '7', "pqrs",
            '8', "tuv",
            '9', "wxyz"
    );
    List<String> result = new ArrayList<>();
    
    public List<String> letterCombinations(String digits) {
        if(digits.length() != 0){
            backtrack(0, new StringBuilder() , digits);
        }
        return result;  
    }
    private void backtrack(int i, StringBuilder currentStr, String digits){
        if(currentStr.length() == digits.length()){
            result.add(currentStr.toString());
            return;
        }
        String str = map.get(digits.charAt(i));
        for(char c: str.toCharArray()){
            backtrack(i+1, currentStr.append(c), digits);
            currentStr.deleteCharAt(currentStr.length() - 1);

        }
    }
}