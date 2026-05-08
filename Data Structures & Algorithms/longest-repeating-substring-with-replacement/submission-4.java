class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        int max = 0;
        int maxFreq = 0;
        int[] charArr = new int[26];
        while (r < s.length()) {
            charArr[s.charAt(r) - 'A']++;
            maxFreq = Math.max(maxFreq, charArr[s.charAt(r) - 'A']);

        
            if ((r - l + 1) - maxFreq > k) {
                charArr[s.charAt(l) - 'A']--;
                l++;
            }

            max = Math.max(max, r - l + 1);
            r++;
        }
        return max;
    }
}
