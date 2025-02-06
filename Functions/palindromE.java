import java.util.*;
public class palindromE {
    public static boolean palindrome (int num){
        int reverse=reverseNumber.reverse(num);
        if (reverse==num) {
            return true;
        }
        else{
            return false;
        }
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number to check if palindrome or not:");
    int num=sc.nextInt();
    boolean res=palindrome(num);
    System.out.println(res);
    sc.close();

}
}