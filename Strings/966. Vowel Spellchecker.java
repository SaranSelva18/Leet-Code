class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exact=new HashSet<>();
        Map<String,String> lowerIncase=new HashMap<>();
        Map<String,String> devowelCase=new HashMap<>();

        for(String word:wordlist){
            exact.add(word);

            String v=word.toLowerCase();
            lowerIncase.putIfAbsent(v,word);

            String d=devowel(word);
            devowelCase.putIfAbsent(d,word);
        }

        String[] result=new String[queries.length];
        for(int i=0;i<queries.length;i++){
            String s=queries[i];
            if(exact.contains(s)){
                result[i]=s;
            }
            else{
                String lower=s.toLowerCase();
                if(lowerIncase.containsKey(lower)){
                    result[i]=lowerIncase.get(lower);
                }
                else{
                String dev=devowel(s);
                if(devowelCase.containsKey(dev)){
                    result[i]=devowelCase.get(dev);
                }
            else{
                result[i]="";
                }
               }
            }
        }
            return result;
        }
        String devowel(String word){
            StringBuilder w=new StringBuilder();
            word=word.toLowerCase();
            for(int i=0;i<word.length();i++){
                if("aeiou".indexOf(word.charAt(i))!=-1){
                    w.append("*");
                }
                else{
                    w.append(word.charAt(i));
                }
            }
            return w.toString();
        }
    }