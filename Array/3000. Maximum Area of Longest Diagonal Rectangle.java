class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int area=0;
        double max=0;
        for(int i=0;i<dimensions.length;i++){
                double length=Math.sqrt(dimensions[i][0]*dimensions[i][0]+dimensions[i][1]*dimensions[i][1]);
                if(length>max){
                    max=length;
                    area=dimensions[i][0]*dimensions[i][1];
                }
                else if(length == max){
                    area=Math.max(area,dimensions[i][0]*dimensions[i][1]);
                }
        }
        return area;
    }
}