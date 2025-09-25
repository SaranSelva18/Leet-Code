class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        
        paragraph=paragraph.replaceAll("[^a-zA-z]"," ").toLowerCase();
        String[] arr=paragraph.split("\\s+");
        int max = 0;
        String res = "";
        for (int j = 0; j < arr.length; j++) {
            boolean isBanned = false;
            for (int i = 0; i < banned.length; i++) {
                if (arr[j].equals(banned[i])) {
                    isBanned = true;
                    break;
                }
            }
            if (isBanned || arr[j].isEmpty()) continue;

            int count = 1; 
            for (int k = j + 1; k < arr.length; k++) {
                if (arr[j].equals(arr[k])) {
                    count++;
                }
            }

            if (count > max) {
                max = count;
                res = arr[j];
            }
        }

        return res;
    }
}