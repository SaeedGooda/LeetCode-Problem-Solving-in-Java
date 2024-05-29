class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i < strs[0].length() ; i++){
            char c = strs[0].charAt(i);
            for(int j = 1 ; j < strs.length ; j++){
                if(i == strs[j].length() || c != strs[j].charAt(i)){
                    return result.toString();
                }
            }
            result.append(c);
        }
        return result.toString();
    }
}