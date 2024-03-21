public class Solution {

    public int lengthOfLastWord(String s) {
        String [] s_a = s.split(" ");
        return s_a[s_a.length-1].length();
    }

}
