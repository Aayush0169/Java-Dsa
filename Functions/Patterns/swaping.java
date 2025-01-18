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
        swap2(12,25);
    }

}
