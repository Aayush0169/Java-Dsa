import java.util.*;
class init {
    static int[][] matrixInput(int rows,int cols){
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[rows][cols];
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter value for: ["+i+"] ["+j+"]");
                matrix[i][j]=sc.nextInt();
            }
        }
        return matrix;
    }
    static void printMatrix(int arr[][]){
        System.out.println("Here is your matrix: ");
        for(int vals[] :arr){
            for (int val:vals){
            System.out.print(val+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows=sc.nextInt();
        
        System.out.println("Enter number of cols: ");
        int cols=sc.nextInt();

        int matrix[][]=matrixInput(rows,cols);
        printMatrix(matrix);
        sc.close();
        
    }
}