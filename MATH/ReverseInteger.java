class Solution {
    public int reverse(int x) {
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10; 
            x /= 10; 

            if (reversed > Integer.MAX_VALUE / 10 || 
                (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // Overflow case
            }
            if (reversed < Integer.MIN_VALUE / 10 || 
                (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Underflow case
            }

            reversed = reversed * 10 + digit; // Build the reversed number
        }

        return reversed; // Return the reversed number
    }
}
