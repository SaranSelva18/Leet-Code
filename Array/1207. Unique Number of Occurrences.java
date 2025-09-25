class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        HashMap<Integer,Integer> freq=new HashMap<>();

        for(int nums:arr){
            freq.put(nums,freq.getOrDefault(nums,0)+1);
        }
        
        Set<Integer> seen=new HashSet<>();
        for(int val:freq.values()){
            if(!seen.add(val)){
                return false;

            }
        }
        return true;
    }
}