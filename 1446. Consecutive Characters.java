class Solution {
    public int maxPower(String s) {
        if(s.length() <= 1){
            return s.length();
        }
        int power = Integer.MIN_VALUE;
        int count = 1;
        for(int i = 1 ; i < s.length() ; i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            } else{
                power = Math.max(power, count);
                count = 1;
            }
        }
        power = Math.max(power, count);
        return power;
    }
}