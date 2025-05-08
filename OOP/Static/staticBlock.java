package Static;

public class staticBlock {
    static int a;
    static int b;

    static{
        System.out.println("Currently in static block");
        int b=a+10;
        System.out.println("b is: "+b);
    };

    public static void main(String[] args) {
     System.out.println(staticBlock.b+" "+staticBlock.a); 
      }
}
