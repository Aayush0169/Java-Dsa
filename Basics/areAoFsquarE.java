import java.util.*;
public class areAoFsquarE {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter side of the Square: ");
        float side=sc.nextFloat();
        float area=side*side;
        float perimeter =4*side;
        System.out.println("The properties of square are: ");
        System.out.println("Area: "+area+ "\n Perimeter: "+perimeter);

        sc.close();
    }
}
