class Solution {

    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxAmount = 0;
        while (i < j){
            int r = j-i;
            int amount = (height[i] <= height[j])? height[i++] * r : height[j--] * r;
            if(amount > maxAmount) maxAmount = amount;
        }
        return maxAmount;
    }

}
