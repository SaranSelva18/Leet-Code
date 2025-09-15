class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        
        String[] arr=text.split(" ");
        int result=0;
        for(String word:arr){
        int count=0;
        boolean bool=true;
        for(int i=0;i<brokenLetters.length();i++){
            if(word.indexOf(brokenLetters.charAt(i))!=-1){
                 bool=false;
                 break;
            }
        }
        if(bool){
            result++;
        }
        }
        return result;
    }
}