import java.util.Scanner;

public class reverseNumber {
    public static int reverse(int num) {
        int reversedNumber = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            num = num / 10;
        }
        return reversedNumber;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:  ");
        int num=sc.nextInt();
        int res=reverse(num);
        System.out.println("Reversed:\n "+res );
        sc.close();
    }
    
}
