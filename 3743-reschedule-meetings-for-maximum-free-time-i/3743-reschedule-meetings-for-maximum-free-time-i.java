class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
         int n = startTime.length; 
        List<Integer> freeIntervals = new ArrayList<>(); 

        freeIntervals.add(startTime[0]); 

        for (int i = 1; i < n; i++) { 
            freeIntervals.add(startTime[i] - endTime[i - 1]); 
        } 

        freeIntervals.add(eventTime - endTime[n - 1]); 

        int windowSum = 0; 
        for (int i = 0; i < k + 1; i++) { 
            windowSum += freeIntervals.get(i); 
        } 

        int maxFree = windowSum; 
        for (int i = k + 1; i < freeIntervals.size(); i++) { 
            windowSum += freeIntervals.get(i) - freeIntervals.get(i - (k + 1)); 
            maxFree = Math.max(maxFree, windowSum); 
        } 

        return maxFree; 
    }
}