import java.util.*;
public class initializE{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num[]=new int[5];
        for(int i=0;i<num.length;i++){
            System.out.println("Enter value index "+i+": ");
            num[i]=sc.nextInt();
        }
        System.out.println("The array is: ");
        for(int j=0;j<num.length;j++){
            System.out.print(num[j]);
        }
       sc.close();
        
    }
}