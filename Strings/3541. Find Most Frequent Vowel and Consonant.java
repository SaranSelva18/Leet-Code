class Solution {
    public int maxFreqSum(String s) {
        int[] freq=new int[256];

        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        int vowel=0;
        int consonents =0;
        for(int i=0;i<freq.length;i++){
            if("aeiou".indexOf((char)i)!=-1 && freq[i]>vowel){
                vowel=freq[i];
            }
            else if("aeiou".indexOf((char)i)==-1 && freq[i]>consonents){
                consonents=freq[i];
            }
        }
        return vowel+consonents;
    }
}