class Solution {
    public boolean isPalindrome(String s) {
        if(s==null || s.trim().isEmpty()){
            return true;
        }
        
        StringBuilder str=new StringBuilder();

        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                str.append(Character.toLowerCase(c));
            }
        }
        
        String org=str.toString();
        String rev=str.reverse().toString();

        return org.equals(rev);
    }
}