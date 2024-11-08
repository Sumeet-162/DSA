class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int n=s.length();
        if(n==0)
            return 0;
        HashMap<Character,Integer> charcount = new HashMap<>();
        int maxlen=0;
        for(int end=0;end<n;end++){
            char currentele=s.charAt(end);

            if(charcount.containsKey(currentele)){
                start= Math.max(start,charcount.get(currentele)+1);
            }
            charcount.put(currentele,end);

            maxlen=Math.max(maxlen,end-start+1);
        }
        return maxlen;
    }
}
