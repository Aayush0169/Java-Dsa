import java.util.*;
public class func {
    public static void hello(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your name: ");
        String name=sc.nextLine();
        System.out.println("Wlecome "+name+" nice to meet you!");
        sc.close();
    }
    public static void main(String Args[]){
        hello();
    }
    
}