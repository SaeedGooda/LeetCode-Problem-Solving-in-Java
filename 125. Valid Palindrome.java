class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        while (start < end){
            char a = s.charAt(start);
            char b = s.charAt(end);

            a = Character.toLowerCase(a);
            b = Character.toLowerCase(b);

            if(!isAlphanumeric(a)){
                start++;
                continue;
            }
            if(!isAlphanumeric(b)){
                end--;
                continue;
            }
            if(a != b){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static boolean isAlphanumeric(char c){
        if((c>='a' && c<='z') || (c>='0' && c<='9')) return true;
        return false;
    }
}