class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String res = "";
        for (char c : s.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                res += String.valueOf(c);
            }
        }

        for (int i = 0; i < res.length() / 2; i++) {
            if (!(res.charAt(i) == res.charAt(res.length() - 1 - i))) {
                return false;
            }
        }
        return true;
    }
}
