class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        ArrayList<Integer> list=new ArrayList<>();

        for(int n:baskets){
            list.add(n);
        }

        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<list.size();j++){
                if(fruits[i]<=list.get(j)){
                    list.remove(j);
                    break;
                }
            }
        }
        return list.size();
    }
}