class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int reverse = 0;
        while (x > 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x /= 10;
        }
        if (reverse == num) {
            return true;
        }
        return false;
    }
}