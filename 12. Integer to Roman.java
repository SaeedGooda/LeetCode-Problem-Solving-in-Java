class Solution {

    public String intToRoman(int num){
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i < values.length; i++){
            if(num == 0){
                break;
            }
            while(num >= values[i]){
                result.append(romanLetters[i]);
                num -= values[i];
            }
        }
        return result.toString();
    }

}
