import java.util.*;
public class bill {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Bill for products with tax!");

        System.out.println("Enter price product of 1:");
        float a=sc.nextFloat();

        System.out.println("Enter price product of 2:");
        float b=sc.nextFloat();

        System.out.println("Enter price product of  3:");
        float c=sc.nextFloat();

        System.out.println("Enter price product of  4:");
        float d=sc.nextFloat();

        System.out.println("Enter price product of  5:");
        float e=sc.nextFloat();

        float total=a+b+c+d+e;
        float tax=total*0.18f;

        System.out.println("Total price: "+total);  

        System.out.println("The Tax: "+tax); 
        System.out.println("The final bill is: "+(total+tax)); 
        sc.close();
    }
}
