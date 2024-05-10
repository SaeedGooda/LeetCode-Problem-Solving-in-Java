class Solution {
    public int hammingWeight(int n) {
        String str = Integer.toBinaryString(n);
        int count = 0;
        for(char ch: str.toCharArray()){
            if(ch == '1'){
                count++;
            }
        }
        return count;
    }
}