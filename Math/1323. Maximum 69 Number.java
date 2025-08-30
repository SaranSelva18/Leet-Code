class Solution {
    public int maximum69Number (int num) {
        if(num==9999)
        return num;
        
        StringBuilder str=new StringBuilder(String.valueOf(num));
        for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='6'){
        str.setCharAt(i,'9');
        break;
        }
        }
        return Integer.parseInt(str.toString());
    }
}