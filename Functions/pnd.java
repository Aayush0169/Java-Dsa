public class pnd {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int original = x;
        int reverse = 0;
        while (x != 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x /= 10;
        }
        return reverse == original;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}