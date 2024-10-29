class Solution {
    public String reverseVowels(String s) {
        char[] s_arr = s.toCharArray();
        int left = 0;
        int right = s_arr.length-1;
        while(left < right){
            while(left < right && !isVowel(s_arr[left])){
                left++;
            }
            while(left < right && !isVowel(s_arr[right])){
                right--;
            }
            char temp = s_arr[left];
            s_arr[left] = s_arr[right];
            s_arr[right] = temp;
            left++;
            right--;
        }
        return new String(s_arr);
    }
    private boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}