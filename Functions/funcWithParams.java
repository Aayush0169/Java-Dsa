import java.util.*;
public class funcWithParams {
    public static int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers to procced");
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter second number: ");
        int b=sc.nextInt();
        int sum=sum(a, b);
        System.out.println("The sum is: "+sum);

    }
}