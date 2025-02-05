import java.util.Scanner;

public class oppositEtriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows=sc.nextInt();
        for(int row=1;row<=rows;row++){
            for(int col=1;col<=rows;col++){
                if (row+col>rows) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                    
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
