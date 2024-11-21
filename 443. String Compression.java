// Solution 1

class Solution {
    public int compress(char[] chars) {
        if(chars.length == 1){
            return 1;
        }
        StringBuilder s = new StringBuilder();
        char prev = chars[0];
        int count = 1;
        for(int i = 1 ; i < chars.length ; i++){
            if(chars[i] == prev){
                count++;
            } else{
                s.append(prev);
                if(count > 1) s.append(String.valueOf(count));
                prev = chars[i];
                count = 1;
            }
            if(i == chars.length - 1){
                s.append(prev);
                if(count > 1) s.append(String.valueOf(count));
            }
        }
        for(int i = 0 ; i < s.length() ; i++){
            chars[i] = s.charAt(i);
        }
        return s.length();
    }
}

// Solution 2

class Solution {
    public int compress(char[] chars) {
        int write = 0, count = 1;
        
        for (int read = 1; read <= chars.length; read++) {
            if (read < chars.length && chars[read] == chars[read - 1]) {
                count++;
            } else {
                chars[write++] = chars[read - 1];
                if (count > 1) {
                    for (char c : Integer.toString(count).toCharArray()) {
                        chars[write++] = c;
                    }
                }
                count = 1;
            }
        }
        return write;
    }
}
