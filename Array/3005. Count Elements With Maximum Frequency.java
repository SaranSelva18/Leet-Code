class Solution {
    public int maxFrequencyElements(int[] nums) {
        
            int[] freq=new int[256];

            for(int i=0;i<nums.length;i++){
                freq[nums[i]]++;
            }

            int max=0;
            for(int j=0;j<freq.length;j++){
                if(freq[j]>max){
                    max=freq[j];
                }
            }
            int res=0;
            for(int k=0;k<freq.length;k++){
                if(freq[k]==max){
                    res+=freq[k];
                }
            }
            return res;
    }
}