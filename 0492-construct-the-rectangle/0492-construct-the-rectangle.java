class Solution {
    public int[] constructRectangle(int area) {
        int temp = (int) Math.sqrt(area);
        int l = area, b = 1;

        for (int i = 1; i <= temp; i++) {
            if (area % i == 0) {
                int width = area / i;
                if (i <= width) {   
                    l = width;
                    b = i;
                }
            }
        }
        return new int[] { l, b };
    }
}
