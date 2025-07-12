class Solution {
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, 
        (a, b)->{
            if(a[0]-b[0]==0){
                return Integer.compare(a[1], b[1]);
            } else {
                return Integer.compare(a[0], b[0]);
            }
        });

        long[] room = new long[n];
        int[] occurrence = new int[n];

        for(int[] meeting:meetings){
            long currentMeetingStartTime = meeting[0];
            long currentMeetingEndTime = meeting[1];
            long duration = currentMeetingEndTime - currentMeetingStartTime;
            int roomNo=-1, leastDelayedRoomNo=-1;
            long leastDelayedEndTime=Long.MAX_VALUE;
 
            for(int i=0; i<n; i++){
                if(room[i]<=currentMeetingStartTime){
                    roomNo=i;
                    break;
                } else {
                    if(room[i]<leastDelayedEndTime){
                        leastDelayedEndTime=room[i];
                        leastDelayedRoomNo=i;
                    }
                }
            }
            if(roomNo==-1){
                roomNo = leastDelayedRoomNo;
                currentMeetingStartTime = leastDelayedEndTime;
                currentMeetingEndTime = currentMeetingStartTime + duration;
            } else {
                currentMeetingEndTime = currentMeetingStartTime + duration;
            }

            occurrence[roomNo]++;
            room[roomNo] = currentMeetingEndTime;
        }

        int maxOccurenceRoomNo=0, maxOccurrence=0;
        for(int i=0; i<occurrence.length; i++){
            if(occurrence[i]>maxOccurrence){
                maxOccurrence=occurrence[i];
                maxOccurenceRoomNo=i;
            }
        }
        return maxOccurenceRoomNo;
    }
}
