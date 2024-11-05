class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String result = "1";        
        for (int i = 1; i < n; i++) {
            result = buildNextSequence(result);
        }
        return result;
    }
    
    private String buildNextSequence(String s) {
        StringBuilder nextSequence = new StringBuilder();
        int count = 1;
        char currentChar = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == currentChar) {
                count++;
            } else {
                nextSequence.append(count).append(currentChar);
                currentChar = s.charAt(i);
                count = 1;
            }
        }
        
        nextSequence.append(count).append(currentChar);
        return nextSequence.toString();
    }
}