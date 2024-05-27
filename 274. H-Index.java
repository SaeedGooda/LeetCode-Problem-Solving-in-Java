class Solution {
    public int hIndex(int[] citations) {
        if (citations == null){
            return 0;
        }
        Arrays.sort(citations);
        int h = 0;
        int len = citations.length;
        for (int i = len - 1; i >= 0; i--) {
            if (citations[i] > h) {
                h++;
            } else{
                break;
            }
        }
        return res;
    }
}