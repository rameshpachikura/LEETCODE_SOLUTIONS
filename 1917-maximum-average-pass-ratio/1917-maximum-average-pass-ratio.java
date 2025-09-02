class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        int n = classes.length;

        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));

        for( int i = 0; i < n; i++ ) {
            double currPr = (double) classes[i][0] / classes[i][1];
            double newPr = (double) (classes[i][0] + 1) / (classes[i][1] + 1);
            double delta = newPr - currPr;
            pq.offer(new double[]{ delta, i });
        }

        while( extraStudents > 0 ) {
            double[] curr = pq.poll();
            int idx = (int) curr[1];


            classes[idx][0]++;
            classes[idx][1]++;

            double currPr = ( double ) classes[idx][0] / classes[idx][1];
            double newPr = (double) ( classes[idx][0] + 1 ) / ( classes[idx][1] + 1 );
            double delta = newPr - currPr;

            pq.offer(new double[]{delta, idx});
            extraStudents -= 1;

        }

        double res = 0.0;
        for( int i = 0; i < n; i++ ) {
            res += (double) classes[i][0] / classes[i][1] ;
        }

        return res / n;

    }
}