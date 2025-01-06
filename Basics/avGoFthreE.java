import java.util.*;
public class avGoFthreE {
    public static void main(String args[]){
        Scanner num=new Scanner(System.in);
        System.out.println("Enter three numbers to get average");
        System.out.println("Enter First no.");
        float a=num.nextFloat();

        System.out.println("Enter Second no.");
        float b=num.nextFloat();

        System.out.println("Enter Third no.");
        float c=num.nextFloat();

        float sum=a+b+c;
        
        System.out.println("The average of given numbers is "+ sum/3);

    }

}