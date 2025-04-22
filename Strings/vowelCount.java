import java.util.Scanner;

public class vowelCount {
    public static int count(String str){
        short count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str=sc.nextLine();        
        System.out.println("the total number of lower case vowels in your string: is "+count(str));
    }
}
