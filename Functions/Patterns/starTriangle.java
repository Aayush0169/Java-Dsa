import java.util.*;
public class starTriangle{
    public static void triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int lines=sc.nextInt();
        System.out.println();
        triangle(lines);
        sc.close();
    }
    
}