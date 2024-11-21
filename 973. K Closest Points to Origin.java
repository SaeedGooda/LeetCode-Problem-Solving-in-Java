class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] result = new int[k][2];
        Queue<int[]> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(calculateDistanceToOrigin(b), calculateDistanceToOrigin(a)));

        for (int[] point : points) {
            maxHeap.offer(point);
            if (maxHeap.size() > k){
                maxHeap.poll();
            }
        }

        int i = k;
        while (!maxHeap.isEmpty()){
            result[--i] = maxHeap.poll();
        }
        return result;
    }

    private int calculateDistanceToOrigin(int[] point){
        return point[0] * point[0] + point[1] * point[1];
    }
}