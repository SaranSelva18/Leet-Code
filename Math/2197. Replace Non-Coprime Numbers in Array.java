class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        
    List<Integer> res=new ArrayList<>();

    for(int num:nums){
        res.add(num);

        while(res.size()>1){
            int a=res.get(res.size()-1);
            int b=res.get(res.size()-2);

        int g=gcd(a,b);

        if(g>1){
            res.remove(res.size()-1);
            res.remove(res.size()-1);
            res.add(lcm(a,b,g));
        }
        else{
            break;
        }
        } 
    }
     return res;
    }



    public static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }

    public static int lcm(int a, int b, int g){
        return (int)((long)a*b/g);
    }

    
   
}