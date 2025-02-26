class Solution {
    public int solution(int[][] sizes) {
        int width = 0, height = 0;
        for(int[] size : sizes) {
            int a = size[0], b = size[1];
            size[0] = Math.max(a, b);
            size[1] = Math.min(a, b);
            width = Math.max(size[0], width);
            height = Math.max(size[1], height);
        }
        return width * height;
    }
}