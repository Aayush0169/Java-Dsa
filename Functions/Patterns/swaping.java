import java.util.*;
public class swaping {
    public static void swap1(int a, int b){
        int temp;
        temp=a; a=b; b=temp;
        System.out.print(a+","+b);
    }
    public static void swap2(int a,int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.print(a + "," + b);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Print 1st number: ");
        int a=sc.nextInt();
        System.out.println("Print 2nd number: ");
        int b=sc.nextInt();
        swap2(a,b);
        sc.close();
    }

}
