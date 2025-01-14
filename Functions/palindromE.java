import java.util.*;
public class palindromE {
    public static void palindrome (int originalNumber){
         int temp = originalNumber; 
         int reversedNumber = 0; 
         int remainder; while (temp != 0) { remainder = temp % 10; 
            reversedNumber = reversedNumber * 10 + remainder; temp /= 10;
         }
          if (originalNumber == reversedNumber)
           { System.out.println(originalNumber + " is a palindrome number."); 
        } 
        else {
             System.out.println(originalNumber + " is not a palindrome number.");
    }
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number to check if palindrome or not:");
    int num=sc.nextInt();
    palindrome(num);
    sc.close();

}
}