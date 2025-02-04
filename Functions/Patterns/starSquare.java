import java.util.Scanner;

public class starSquare {
    public static void sqrOfStar(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n=sc.nextInt();
        System.out.println("Here is your pattern of "+ n +" rows:");
        sqrOfStar(n);
        sc.close();
    }
}
