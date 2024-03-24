class Solution {

    public int mySqrt(int x){
        long result = x;
        for(long i = 1 ; i*i<=x ; i++){
            result = i;
        }
        return (int) result;
    }

}
