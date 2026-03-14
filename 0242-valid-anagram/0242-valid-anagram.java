public class Solution {
    public boolean isAnagram(String ss, String t) {
        int[] alphabet = new int[26];
        for (int i = 0; i < ss.length(); i++) alphabet[ss.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
        for (int i : alphabet) if (i != 0) return false;
        return true;
    }
}