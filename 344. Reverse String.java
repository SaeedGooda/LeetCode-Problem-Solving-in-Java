// Solution 1

class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        String str = String.valueOf(s);
        for(int i = 0 ; i < len ; i++){
            s[i] = str.charAt(len - 1 - i);
        }
    }
}

// Solution 2

class Solution {
    public void reverseString(char[] s) {
        char temp = ' ';
        int len = s.length;
        for(int i =  0 ; i < len/2 ; i++){
            temp = s[i];
            s[i] = s[len-1-i];
            s[len-1-i] = temp;
        }
    }
}