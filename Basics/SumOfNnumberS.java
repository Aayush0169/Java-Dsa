import java.util.Scanner;

public class SumOfNnumberS {
public static void main(String[] args){ 
    Scanner sc= new Scanner(System.in);
    System.out.println("This programme gives sum of first n numbers");
    System.out.println("Enter Value of n: ");
    int num=sc.nextInt();
    int i=0;
    int sum=0;
    while (i<=num) {
        sum+=i;
        i++;
        
    }
    System.out.println(sum);

}
}