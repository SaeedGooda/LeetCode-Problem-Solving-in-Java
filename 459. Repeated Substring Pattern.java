// Solution 1 : Time = O(n^2)

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                String substring = s.substring(0, i);
                int repeatCount = n / i;
                String repeatedString = substring.repeat(repeatCount);
                if (s.equals(repeatedString)) {
                    return true;
                }
            }
        }
        return false;
    }
}

// Solution 2 : Time = O(n)

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String ss = s + s;
        return ss.substring(1, ss.length()-1).contains(s);
    }
}
