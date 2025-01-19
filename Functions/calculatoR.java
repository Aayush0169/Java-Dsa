import java.util.*;
public class calculatoR {
    public static float sum (float a,float b){
        return a+b;
    }
    public static float sub (float a,float b){
        return a-b;
    }
    public static float product (float a,float b){
        return a*b;
    }
    public static float div (float a,float b){
        return a/b;
    }
    public static float precentage (float a,float b){
        return (a*100)/b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any 2 numbers: ");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        System.out.println("Enter an querry (+, -, *, /,%): "); 
        char querry = sc.next().charAt(0);
        float result;
        
        switch (querry) {
            case '+':
             result=sum(a, b);
            System.out.println("The sum is: "+result);
            break;

            case '/':
            if (a==0&&b==0) {
                System.out.println("undefined");
            }
            else if (b==0) {
                System.out.println("undefined");
                
            }
            else{
                result=div(a, b);
                System.out.println("The QUOTIENT is: "+result);
            }
            break;

            case '*':
            result=product(a, b);
            System.out.println("The product is: "+result);
            break;

            case'-':
            result=sub(a, b); 
            break;

            case'%':
            result=precentage(a, b);
            System.out.println(result+"%");
            break;
        
            default:System.out.println("wrong input");
                break;
        }
        sc.close();
    }
}
