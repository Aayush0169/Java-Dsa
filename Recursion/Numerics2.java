public class Numerics2 {
    public static int power(int number,int power) {
        if (power==0) {
            return 1;
        }
        return number*power(number, power-1);
    }

    public static int optimizedPower(int number, int power){
        if (power==0) {
            return 1;
        }
        int halfPower=optimizedPower(number, power/2);
        int halfPowersq=halfPower*halfPower;
        if (power%2!=0) {
            halfPowersq=halfPowersq*number;
        }
        return halfPowersq;
    }

    public static int sumOfDigits(int number){
        if (number==0) {
            return 0;
        }
        return (number%10)+(sumOfDigits(number/10));
        
    }
    public static int productOfDigits(int number){
        if (number==0) {
            return 1;
        }
        return (number%10)*(productOfDigits(number/10));
        
    }
    public static int helper(int number,int digits){
        if (number%10==number) {
            return number;
        }
        int remender=number%10;
        return remender*optimizedPower(10, digits-1)+helper(number/10, digits-1);
    }
    public static int reverse(int number){
        int digits=(int)(Math.log10(number))+1;
        return helper(number,digits);
    }
    public static boolean isPalindrome(int number){
        if (number==reverse(number)) {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        // System.out.println(sumOfDigits(458796));
        // System.out.println(productOfDigits(329));
        System.out.println(reverse(458));
        System.out.println(isPalindrome(121));
    }
}
