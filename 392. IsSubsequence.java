class Solution {

    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        int i = 0;
        int s_length = s.length();
        for(char c: t.toCharArray()){
            if(s.charAt(i) == c){
                i++;
            }
            if(i == s_length){
                return true;
            }
        }
        return false;
    }

}
