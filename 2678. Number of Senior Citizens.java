class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(String element: details){
            String str = element.substring(11,13);
            int age = Integer.parseInt(str);
            if(age > 60){
                count++;
            }
        }
        return count;
    }
}