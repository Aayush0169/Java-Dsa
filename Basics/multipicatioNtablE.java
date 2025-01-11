import java.util.*;
public class multipicatioNtablE {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number: ");
     int num = sc.nextInt();
      System.out.println("Now enter the limit up to which you want the multiplication table: ");
       int mul = sc.nextInt();
     for (int i = 1; i <= mul; i++) {
         System.out.println(num + " x " + i + " = " + (num * i)); 
        }
    sc.close();
}}
