import java.util.*;
public class posetiveNo {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=sc.nextInt();
    if (num>=0) {
     System.out.println("It is a posetive number");   
    }
    else{
        System.out.println("It is a negative number");   

    }
    sc.close();
}
    
}