import java.util.Scanner;

public class reversEoFnumbeR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("This proggramme gives reverse of a number ");
        System.out.println("Enter a number: ");
        int rvrs=0;
        int n=sc.nextInt();
        while (n>0) {
           int last=n%10;
           n=n/10;
           rvrs=(rvrs*10)+last; 
        }
        System.out.println("Reversed  number is "+rvrs);
        sc.close();
    }
}
