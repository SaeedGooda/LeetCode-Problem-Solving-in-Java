// Solution 1
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

// Solution 2
class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while(n > 0){
            if(n%2 == 1){
                count++;
            }
            n /= 2;
        }
        return count;
    }
}