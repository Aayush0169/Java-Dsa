import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        char arr[]={'a','b','c','d'};
        String str="abcd";
        for (char value : arr) {
            System.out.print(value+" ");
        }
        System.out.println(str);

        //input 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter something: ");
         String input=sc.nextLine();
        System.out.println();
        System.out.println(input);
        sc.close();
    }
}