class Solution {
    public int[] twoSum(int[] nums, int target) {
       // ArrayList<Integer> list=new ArrayList<>();
        int[] list=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    //list.add(i);
                    //list.add(j);
                    list[0]=i;
                    list[1]=j;
                    break;
                }
            }
        }
        return list;
    }
}