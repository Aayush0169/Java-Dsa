import java.util.Scanner;
public class odDeveNsuM {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumEven = 0;
        int sumOdd = 0;

        System.out.println("Enter integers (type 0 to stop): ");
        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }

            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }

        System.out.println("Sum of even integers: " + sumEven);
        System.out.println("Sum of odd integers: " + sumOdd);

        sc.close();
    }
}


