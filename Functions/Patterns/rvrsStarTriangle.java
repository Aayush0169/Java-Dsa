import java.util.Scanner;

public class rvrsStarTriangle {
public static void reverseTriangle(int rows){
    for(int row=1;row<=rows;row++){
        for(int col=1;col<=rows;col++){
            if (row+col<rows+2) {
                System.out.print("*");
            }
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of the rows: ");
        int rows=sc.nextInt();
        System.out.println("Here is your reversed triangle of "+rows+" rows");
        reverseTriangle(rows);
        sc.close();
    }
}
