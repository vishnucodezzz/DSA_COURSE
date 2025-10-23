
//  problem number 242 
//  https://leetcode.com/problems/valid-anagram/

public class ValidAnagram {
    public static void main(String[] args) {
        ValidAnagram va = new ValidAnagram();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(va.isAnagram(s, t));
    }

    public boolean isAnagram(String s, String t) {
        boolean ans = true;
        int[] arr = new int[26];
        if (s.length() == t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return ans;
    }

}
