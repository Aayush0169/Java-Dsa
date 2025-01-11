import java.util.*;//importing utils for scanning/taking input
public class inOut {
    public static void main(String args[]){
        // int a=785;
        // int b=456;
        // System.out.println(a+b);
        System.out.println("Enter Your name");
        Scanner sc=new Scanner(System.in);
        String inName =sc.nextLine();  //inputName is a variable

        System.out.println("Enter Your Roll no.");
        int inRoll=sc.nextInt();

        System.out.println("Enter Your CGPA: ");
        float inCgpa=sc.nextFloat();
        sc.close();
        System.out.println("Hello "+inName+ "\nYour Roll No. is: "+inRoll+ "\nand your CGPA was: "+inCgpa+" This Year! ");
    }
    
}