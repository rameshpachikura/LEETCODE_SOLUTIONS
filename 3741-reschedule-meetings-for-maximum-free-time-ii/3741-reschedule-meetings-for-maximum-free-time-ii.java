class Solution {
    public int maxFreeTime(int eventTime, int[] startTime, int[] endTime) {
        int meetingLength = startTime.length;
        int result = 0;
        boolean[] isMovableMeeting = new boolean[meetingLength];
        
        // calculate meeting is movable to not adjacent space
        for(int i=0,maxSpaceLeft = 0,maxSpaceRight = 0;i<meetingLength;++i){
            if(!isMovableMeeting[i] && endTime[i]-startTime[i] <= maxSpaceLeft){
                isMovableMeeting[i] = true;
            }
            if(!isMovableMeeting[meetingLength-i-1] && endTime[meetingLength-i-1]-startTime[meetingLength-i-1]<= maxSpaceRight){
                isMovableMeeting[meetingLength-i-1] = true;
            }
            maxSpaceLeft = Math.max(maxSpaceLeft,startTime[i] - (i==0?0:endTime[i-1]));
            maxSpaceRight = Math.max(maxSpaceRight,(i==0?eventTime:startTime[meetingLength-i]) - endTime[meetingLength-i-1]);
        }

        for(int i=0;i<meetingLength;++i){
            int left = i==0?0:endTime[i-1];
            int right = i == meetingLength - 1? eventTime: startTime[i+1];
            if(isMovableMeeting[i]){
                result = Math.max(result, right - left);
            }else{
                result = Math.max(result, right - left - (endTime[i] - startTime[i]));
            }            
        }
        return result;
    }
}