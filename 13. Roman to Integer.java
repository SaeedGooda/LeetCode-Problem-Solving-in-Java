import java.util.HashMap;
import java.util.Map;

class Solution {

    public int romanToInt(String s) {
        Map<Character,Integer> hm =new HashMap();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        int result = hm.get(s.charAt(0));
        for(int i = 1 ; i < s.length() ; i++){
            result += hm.get(s.charAt(i));
            if(hm.get(s.charAt(i)) > hm.get(s.charAt(i-1))){
                result -= hm.get(s.charAt(i-1)) * 2;
            }
        }
        return result;
    }

}
