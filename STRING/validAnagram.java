// Valid Anagram
// Solved 
// Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

// An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

// Example 1:

// Input: s = "racecar", t = "carrace"

// Output: true
// Example 2:

// Input: s = "jar", t = "jam"

// Output: false
// Constraints:

// s and t consist of lowercase English letters.

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        char[] cs = s.toCharArray();
        char[] ts = t.toCharArray();

        Arrays.sort(cs);
        Arrays.sort(ts);

        if(Arrays.equals(cs,ts)){
            return true;
        }
        return false;
    }
}
