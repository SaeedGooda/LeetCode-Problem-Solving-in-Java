class Solution {
    public String getEncryptedString(String s, int k) {
        StringBuilder result = new StringBuilder();
        int len = s.length();
        for(int i = 0 ; i < len ; i++){
            result.append(s.charAt((i + k) % len));
        }
        return result.toString();
    }
}