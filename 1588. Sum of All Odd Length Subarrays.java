class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            int temp = 0;
            for(int j = i ; j < n ; j++){
                temp += arr[j];
                if((j - i + 1) % 2 == 1){
                    sum += temp;
                }
            }
        }
        return sum;
    }
}