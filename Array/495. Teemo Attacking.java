class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        
        int res=0;
        for(int j=1;j<timeSeries.length;j++){
                res+=Math.min(duration,timeSeries[j]-timeSeries[j-1]);
        }

        res+=duration;
        return res;
    }
}