class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String [] s_array = s.split(" ");
        if(pattern.length() != s_array.length){
            return false;
        }
        for(int i = 0 ; i < s_array.length ; i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(s_array[i])){
                    return false;
                }
            } else if(!map.containsKey(pattern.charAt(i)) && !map.containsValue(s_array[i])){
                map.put(pattern.charAt(i), s_array[i]);
            } else{
                return false;
            }
        }
        return true;
    }
}