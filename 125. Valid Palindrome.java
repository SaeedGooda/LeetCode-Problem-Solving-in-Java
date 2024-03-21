class Solution {

    // We have 2 solutions
    // First Solution using Builtin Functions ==> 14ms
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        String new_s = new StringBuilder(s).reverse().toString();
        if(s.equals(new_s)) return true;
        else return false;
    }

    // Second Solution ==> 1ms
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        while (start < end){
            char a = s.charAt(start);
            char b = s.charAt(end);

            a = toLower(a);
            b = toLower(b);

            if(!isisAlphanumeric(a)){
                start++;
                continue;
            }
            if(!isisAlphanumeric(b)){
                end--;
                continue;
            }
            if(a != b) return false;
            start++;
            end--;
        }
        return true;
    }
    public char toLower(char c){
        if(c >= 'A' && c <= 'Z'){
            return (char)(c+32);
        }
        return c;
    }
    public boolean isisAlphanumeric(char c){
        if((c>='a' && c<='z') || (c>='0' && c<='9')) return true;
        return false;
    }
}
