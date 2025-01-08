import java.util.Scanner;

public class numbeRprinteR {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the last number");
int num=1;
int number=sc.nextInt();
System.out.println("Here are the numbers: ");
while (num<=number) {
    System.out.println(num);
    num++;
}}}