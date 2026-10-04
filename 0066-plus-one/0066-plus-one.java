class Solution {
    public int[] plusOne(int[] digits) {

        // Start from the last digit
        for (int i = digits.length - 1; i >= 0; i--) {

            // If digit is less than 9,
            // simply increase it by 1
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If digit is 9, it becomes 0
            digits[i] = 0;
        }

        // If we reach here, every digit was 9
        int[] result = new int[digits.length + 1];

        // First digit becomes 1
        result[0] = 1;

        return result;
    }
}