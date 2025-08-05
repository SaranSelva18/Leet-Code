class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> set1=new HashSet<>();
        for(int num:nums1){
            set1.add(num);
        }
        Set<Integer> common=new HashSet<>();
        for(int num:nums2){
            if(set1.contains(num))
            common.add(num);
        }

        int[] arr=new int[common.size()];
        int i=0;
        for(int num:common){
            arr[i++]=num;
        }
        return arr;

    }
}