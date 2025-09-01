class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while(n!=1 && !seen.contains(n)){
            seen.add(n);
            int square=0;
            while(n>0){
                int digit=n%10;
                square+=digit*digit;
                n=n/10;
            }
            n=square;
            
            }
        return n == 1;
    }
}