class DigitUtil {

    // Static method
    public static int digitCount(int n) {
        n = Math.abs(n); // Handle negative numbers

        if (n == 0)
            return 1;

        int count = 0;

        while (n > 0) {
            count++;
            n /= 10;
        }

        return count;
    }
}