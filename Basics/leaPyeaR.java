import java.util.*;
public class leaPyeaR {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year: ");
        int yr=sc.nextInt();
        if (yr%4==0) {
            System.out.println("Year "+yr+" is a leap year");
        }
        else{
            System.out.println("Year "+yr+" is not a leap year");

        }
    }
}
