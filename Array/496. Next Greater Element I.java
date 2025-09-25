class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        List<Integer> l=new ArrayList<>();
        

        for(int num:nums1){
            for(int i=0;i<nums2.length;i++){
                if(num==nums2[i]){
                    boolean greaterfound=false;
                    for(int j=i+1;j<nums2.length;j++){
                        if(nums2[j]>nums2[i]){
                            l.add(nums2[j]);
                            greaterfound=true;
                            break;
                        }
                        }
                        if(!greaterfound){
                            l.add(-1);
                        }
                    }
                }
            }
        int[] res=new int[l.size()];
        for(int i=0;i<res.length;i++){
             res[i]=l.get(i);
        }

        return res;
    }
}