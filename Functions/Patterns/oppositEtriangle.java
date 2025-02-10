import java.util.Scanner;

public class oppositEtriangle {
    public static void oppositEtriangle1(int rows){
        int lines=rows;
        int space=rows-1;
        int star=1;
        int current_line=1;
        while (current_line<=lines) {
            //print spaces
            for(int i=1;i<=space;i++){
                System.out.print(" ");
            }

            //print stars
            for(int i=1;i<=star;i++){
                System.out.print("*");
            }

            //next line
            System.out.println();
            current_line++;
            space--;
            star++;
        }
    }

    public static void oppositEtriangle2(int rows){//second method
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
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows=sc.nextInt();
        oppositEtriangle1(rows);
        oppositEtriangle2(rows);

        sc.close();
    }
}
