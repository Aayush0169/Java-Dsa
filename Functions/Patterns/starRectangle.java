import java.util.Scanner;

public class starRectangle {
    public static void rectOfStars(int rows,int cols){
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of rows: ");
        int rows=sc.nextInt();
        System.out.println("Enter value of cols: ");
        int cols=sc.nextInt();
        rectOfStars(rows, cols);
        sc.close();

    }
}
