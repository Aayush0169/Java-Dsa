import java.util.Scanner;

public class primE {
    public static boolean isEven(int n){
        if (n%2==0) {
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean prime(int n){
        if (n==2) {
            return true;
        }
        else{
        for(int i=2;i<=Math.sqrt(n);i++){
         if (n %i==0) {
            return false;
         }
        }
        return true;
    }
}
public static void printPrime(int x){
    if (x<=1) {
        System.out.println("Invalid number!");
    }
    else if (x==2) {
        prime(x);
    }
    System.out.println("The prime numbers under "+x+" are: ");
    for(int i=2;i<=x;i++){
        if (prime(i)==true) {
            System.out.println(i);
        }
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        
        //chceking if even
        boolean res=isEven(num);
        
        if (res==true) {
            System.out.println("The number "+num+" is an even number!");
        }
        else{
            System.out.println("The number "+num+" is an odd number!");

        }


        //prime check
        boolean result=prime(4);
        if (result==true) {
            System.out.println("The number "+num+" is a prime number!");
        }
        else{
            System.out.println("The number "+num+" is not a prime number!");

        }

        //prinitng prime numbers under the given input
        printPrime(num);
    }
}
