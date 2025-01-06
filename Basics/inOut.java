import java.util.*;//importing utils for scanning/taking input
public class inOut {
    public static void main(String args[]){
        // int a=785;
        // int b=456;
        // System.out.println(a+b);
        System.out.println("Enter Your name");
        Scanner name=new Scanner(System.in);//"name is a variable"
        String inName =name.nextLine();  //inputName is a variable

        Scanner roll=new Scanner(System.in);
        System.out.println("Enter Your Roll no.");
        int inRoll=roll.nextInt();

        Scanner cgpa=new Scanner(System.in);
        System.out.println("Enter Your CGPA: ");
        float inCgpa=cgpa.nextFloat();

        System.out.println("Hello "+inName+ "\nYour Roll No. is: "+inRoll+ "\nand your CGPA was: "+inCgpa+" This Year! ");
    }
    
}